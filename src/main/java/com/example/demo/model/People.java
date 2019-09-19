package com.example.demo.model;

/**
 * @ClassName People
 * @Description 说明：
 * @Author DynTang
 * @Date 2019-09-18
 * @Version V1.0
 **/
public class People<T>{

    private String id;

    private String name;

    private T extendInfo;

    public People() {
    }

    public People(String id, String name, T t) {
        this.id = id;
        this.name = name;

        this.extendInfo = t;
    }


    public Object getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(T t) {
        this.extendInfo = t;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
