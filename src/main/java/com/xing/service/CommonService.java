package com.xing.service;

import java.util.List;

import com.xing.model.User;
import com.xing.model.UserDetail;
import com.xing.model.UserInfo;

/**
 */
public interface CommonService {
    List<UserInfo> selectUserInfo();

    List<UserDetail> selectUserDetail();
    List<User> selectUser();
    List<User> selectUserOrT1();
}
