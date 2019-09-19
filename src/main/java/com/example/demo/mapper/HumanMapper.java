package com.example.demo.mapper;

import com.example.demo.model.People;
import com.example.demo.model.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName ManMapper
 * @Description 说明：
 * @Author DynTang
 * @Date 2019-09-18
 * @Version V1.0
 **/

@Mapper
public interface HumanMapper {

    List<Person> selectAll();

    People selectZhang(@Param("id") String id);

    People selectLi(@Param("id") String id);

    void insert(People people);

    void update();

    void delete();

}
