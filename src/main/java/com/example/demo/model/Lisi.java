package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Lisi
 * @Description 说明：票种全属性
 * @Author DynTang
 * @Date 2019-09-18
 * @Version V1.0
 **/
public class Lisi extends Man{

    private String sex;

    public Lisi() {
    }

    public Lisi(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
