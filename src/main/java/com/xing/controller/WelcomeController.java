package com.xing.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;

/**
 */
@RestController
public class WelcomeController {

    @RequestMapping("/")
    public Map welcome1() {
        Map model = new HashMap();
        model.put("time", new Date());
        model.put("message", "Hello World");
        return model;
    }
    
    @Autowired
    @Qualifier("oneMongo")
    private MongoTemplate oneMongoTemplate;
    @Autowired
    @Qualifier("twoMongo")
    private MongoTemplate twoMongoTemplate;
    /**
     * 向 localhost:27017/mytest插入数据
     */
    @RequestMapping("/mongo1")
    public String testOneMongoInsert() {
        Map<String, Object> data = Maps.newHashMap();
        Map<String, Object> info = Maps.newHashMap();
        data.put("name", "cgg");
        data.put("attr", "one");
        info.put("age" , 18);
        data.put("info", info);
//        oneMongoTemplate.insert(data, "inventory_27017");
        List<Map> list = oneMongoTemplate.findAll(Map.class, "inventory_27017");
        System.out.println(JSON.toJSONString(list));
        return JSON.toJSONString(list);
    }
    /**
     * 向 localhost:27018/mytest插入数据
     */
    @RequestMapping("/mongo2")
    public String testTwoMongoInsert() {
        Map<String, Object> data = Maps.newHashMap();
        Map<String, Object> info = Maps.newHashMap();
        data.put("name", "cgg");
        data.put("attr", "two");
        info.put("age" , 18);
        data.put("info", info);
//        twoMongoTemplate.insert(data, "inventory_27018");
        List<Map> list = twoMongoTemplate.findAll(Map.class, "inventory_27018");
        System.out.println(JSON.toJSONString(list));
        return JSON.toJSONString(list);
    }
}