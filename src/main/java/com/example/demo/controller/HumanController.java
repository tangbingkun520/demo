package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName ManController
 * @Description 说明：
 * @Author DynTang
 * @Date 2019-09-18
 * @Version V1.0
 **/

@Controller
public class HumanController {

    @Autowired
    HumanService humanService;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    @ResponseBody
    public List<Person> list(){
        return humanService.list();
    }

    @RequestMapping(value = "view",method = RequestMethod.GET)
    @ResponseBody
    public String view(String id,String name){
        Object result = humanService.view(id,name);
        return result.toString();
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody Human human){
        humanService.add(human);
        return "success";
    }

    @RequestMapping(value = "edit",method = RequestMethod.POST)
    @ResponseBody
    public String edit(){

        return "";
    }

    @RequestMapping(value = "delete",method = RequestMethod.GET)
    @ResponseBody
    public String delete(){

        return "";
    }

}
