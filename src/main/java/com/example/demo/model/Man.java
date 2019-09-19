package com.example.demo.model;

/**
 * @ClassName Man
 * @Description 说明：票种公共属性
 * @Author DynTang
 * @Date 2019-09-18
 * @Version V1.0
 **/
public class Man {

    private String id;

    private String name;

    public Man() {
    }

    public Man(String id, String name) {
        this.id = id;
        this.name = name;
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
