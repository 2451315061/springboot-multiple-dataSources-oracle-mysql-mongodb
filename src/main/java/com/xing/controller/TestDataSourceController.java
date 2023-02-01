package com.xing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.xing.model.User;
import com.xing.model.UserDetail;
import com.xing.model.UserInfo;
import com.xing.service.CommonService;

@RestController
public class TestDataSourceController {

    @Autowired
    private CommonService commonService;

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public List<UserInfo> selectUser() {
        System.out.println("查询第一个数据源");
        List<UserInfo> list = commonService.selectUserInfo();
        System.out.println(JSON.toJSONString(list));
        return list;
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public List<UserDetail> userDetail() {
        System.out.println("查询第二个数据源");
        List<UserDetail> list = commonService.selectUserDetail();
        System.out.println(JSON.toJSONString(list));
        return list;
    }
    @RequestMapping(value = "/test3", method = RequestMethod.GET)
    public List<User> user() {
    	System.out.println("查询第三个数据源");
        List<User> list = commonService.selectUser();
        System.out.println(JSON.toJSONString(list));
        return list;
    }
    @RequestMapping(value = "/test4", method = RequestMethod.GET)
    public List<User> userOrT1() {
        System.out.println("查询第四个数据源");
        List<User> list = commonService.selectUserOrT1();
        System.out.println(JSON.toJSONString(list));
        return list;
    }

}