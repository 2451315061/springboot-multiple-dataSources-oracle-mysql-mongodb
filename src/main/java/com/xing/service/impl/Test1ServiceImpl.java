package com.xing.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xing.mapper.UserInfoMapper;
import com.xing.model.UserInfo;
import com.xing.service.Test1Service;

import java.util.List;

@Service
public class Test1ServiceImpl implements Test1Service {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> selectUserInfo() {
        return userInfoMapper.selectAll();
    }
}