package com.xing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xing.model.User;
import com.xing.model.UserDetail;
import com.xing.model.UserInfo;
import com.xing.service.CommonService;
import com.xing.service.Test1Service;
import com.xing.service.Test2Service;
import com.xing.service.Test3Service;
import com.xing.service.Test4Service;

/**
 */
@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    private Test1Service test1Service;
    @Autowired
    private Test2Service test2Service;
    @Autowired
    private Test3Service test3Service;
    @Autowired
    private Test4Service test4Service;

    public List<UserInfo> selectUserInfo() {
        return test1Service.selectUserInfo();
    }

    public List<UserDetail> selectUserDetail() {
        return test2Service.selectUserDetail();
    }
    public List<User> selectUser() {
    	return test3Service.selectUser();
    }

    @Override
    public List<User> selectUserOrT1() {
        return test4Service.selectUser();
    }
}
