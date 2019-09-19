package com.example.demo.service;

import com.example.demo.model.Human;
import com.example.demo.model.Lisi;
import com.example.demo.model.People;
import com.example.demo.model.Person;

import java.util.List;

/**
 * @ClassName ZhangsanService
 * @Description 说明：
 * @Author DynTang
 * @Date 2019-09-18
 * @Version V1.0
 **/
public interface ZhangsanService {

    void add(Human human);

    void edit();

    void delete();

    List<Person> list();

    Object view(String id,String name);
}
