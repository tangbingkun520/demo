package com.example.demo.util;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.demo.model.Li;
import com.example.demo.model.Person;
import com.example.demo.model.Zhang;
import org.apache.ibatis.type.*;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(value = {Li.class, Zhang.class, Person.class})
@MappedJdbcTypes(value = {JdbcType.VARCHAR},includeNullJdbcType = true)
public class JsonTypeHandler<T extends Object>extends BaseTypeHandler<T> {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private Class<T> clazz;
    //这个构造器是用来获取类型的，如果是泛型的typehandler必须要写
    public JsonTypeHandler(Class<T> clazz) {
        if(clazz == null){
            throw new IllegalArgumentException("Type argument cannot be null");
        }
        this.clazz=clazz;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i,toJson(parameter));
    }

    @Override
    public T getNullableResult(ResultSet rs, String columnName) throws SQLException {
        if(columnName==null||columnName.isEmpty()){
            return null;
        }
        return (T) toObject(rs.getString(columnName),clazz);
    }

    @Override
    public T getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return (T) toObject(rs.getString(columnIndex),clazz);
    }

    @Override
    public T getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return (T) toObject(cs.getString(columnIndex),clazz);
    }

    private String toJson(T object) {
        try {
            return MAPPER.writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private T toObject(String content, Class<?> clazz) {
        if (content != null && !content.isEmpty()) {
            try {
                return (T) MAPPER.readValue(content, clazz);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            return null;
        }
    }
}
