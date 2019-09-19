package com.example.demo.model;

/**
 * @ClassName Person
 * @Description 说明：列表属性
 * @Author DynTang
 * @Date 2019-09-19
 * @Version V1.0
 **/
public class Person {

    private String sex;

    private String age;

    public Person() {
    }

    public Person( String sex, String age) {
        this.sex = sex;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "  sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
