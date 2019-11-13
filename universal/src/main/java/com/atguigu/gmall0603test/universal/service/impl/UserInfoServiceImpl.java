package com.atguigu.gmall0603test.universal.service.impl;

import com.atguigu.gmall0603test.universal.bean.UserInfo;
import com.atguigu.gmall0603test.universal.mapper.UserInfoMapper;
import com.atguigu.gmall0603test.universal.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getAllUsers() {
        return userInfoMapper.selectAll();
    }
}
