package com.atguigu.gmall0603test.universal.controller;

import com.atguigu.gmall0603test.universal.bean.UserInfo;
import com.atguigu.gmall0603test.universal.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {


    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("getAllUserList")
    public List<UserInfo> getAllUserList() {
        List<UserInfo> allUsers = userInfoService.getAllUsers();
        return allUsers;
    }
}
