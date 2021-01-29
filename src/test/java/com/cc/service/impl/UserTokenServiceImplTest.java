package com.cc.service.impl;

import com.cc.entity.Menu;
import com.cc.entity.UserToken;
import com.cc.mapper.MenuMapper;
import com.cc.mapper.UserTokenMapper;
import com.cc.platform_system_20210127.PlatformSystem20210127ApplicationTests;
import com.cc.service.UserTokenService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class UserTokenServiceImplTest extends PlatformSystem20210127ApplicationTests {
//    @Autowired
    @Resource
    private UserTokenService userTokenServiceImpl;
    @Autowired
    private UserTokenMapper userTokenMapper;
    @Autowired
    private MenuMapper menuMapper;
    @Test
    void getUser() {
        System.out.println(menuMapper);
        List<Menu> childrenMenuList = menuMapper.getChildrenMenuList();
        System.out.println(childrenMenuList);
//        UserToken byId = userTokenServiceImpl.getById(1);
//        System.out.println(byId);

    }
}