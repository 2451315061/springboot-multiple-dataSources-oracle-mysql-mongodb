package com.xing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xing.mapper.UserOrT1Mapper;
import com.xing.model.User;
import com.xing.service.Test4Service;

/**
 */
@Service
public class Test4ServiceImpl implements Test4Service {

    @Autowired
    private UserOrT1Mapper userMapper;

    public List<User> selectUser() {
        return userMapper.selectAll();
    }
}
