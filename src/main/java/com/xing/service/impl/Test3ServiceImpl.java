package com.xing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xing.mapper.UserMapper;
import com.xing.model.User;
import com.xing.service.Test3Service;

/**
 */
@Service
public class Test3ServiceImpl implements Test3Service {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectUser() {
        return userMapper.selectAll();
    }
}
