package com.xing.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xing.mapper.UserDetailMapper;
import com.xing.model.UserDetail;
import com.xing.service.Test2Service;

import java.util.List;

/**
 */
@Service
public class Test2ServiceImpl implements Test2Service {

    @Autowired
    private UserDetailMapper userDetailMapper;

    public List<UserDetail> selectUserDetail() {
        return userDetailMapper.selectAll();
    }
}
