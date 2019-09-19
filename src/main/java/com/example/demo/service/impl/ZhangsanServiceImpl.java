package com.example.demo.service.impl;

import com.example.demo.mapper.ZhangsanMapper;
import com.example.demo.model.*;
import com.example.demo.service.ZhangsanService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @ClassName ManServiceImpl
 * @Description 说明：
 * @Author DynTang
 * @Date 2019-09-18
 * @Version V1.0
 **/

@Service
public class ZhangsanServiceImpl implements ZhangsanService {

    @Autowired
    ZhangsanMapper zhangsanMapper;

    @Override
    public void add(Human human) {

        switch (human.getName()) {
            case "zhangsan":
                People<Zhang> people = new People<>();
                Zhang zhang = new Zhang();
                BeanUtils.copyProperties(human,people);
                BeanUtils.copyProperties(human,zhang);
                people.setExtendInfo(zhang);
                zhangsanMapper.insert(people);
                break;
            case "lisi":
                People<Li> people1 = new People<>();
                Li li = new Li();
                BeanUtils.copyProperties(human,people1);
                BeanUtils.copyProperties(human,li);
                people1.setExtendInfo(li);
                zhangsanMapper.insert(people1);
                break;
            default:
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public List<Person> list() {
        return zhangsanMapper.selectAll();
    }

    @Override
    public Object view(String id,String name) {
        People people = new People();

        Object obj = new Object();
        switch (name) {
            case "lisi":
                people = zhangsanMapper.selectLi(id);
                Lisi lisi = new Lisi();
                BeanUtils.copyProperties(people,lisi);
                BeanUtils.copyProperties(people.getExtendInfo(),lisi);
                obj = lisi;
                break;
            case "zhangsan":
                people = zhangsanMapper.selectZhang(id);
                Zhangsan zhangsan = new Zhangsan();
                BeanUtils.copyProperties(people,zhangsan);
                BeanUtils.copyProperties(people.getExtendInfo(),zhangsan);
                obj = zhangsan;
                break;
            default:

        }
        return obj;
    }

}
