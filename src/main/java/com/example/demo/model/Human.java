package com.example.demo.model;

/**
 * @ClassName Human
 * @Description 说明：所有种类的全属性
 * @Author DynTang
 * @Date 2019-09-19
 * @Version V1.0
 **/
public class Human extends Man {

    private String sex;

    private String age;

    private String phone;

    public Human() {
    }

    public Human(String id, String name, String sex, String age) {
        super(id, name);
        this.sex = sex;
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
