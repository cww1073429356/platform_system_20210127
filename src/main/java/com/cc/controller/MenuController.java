package com.cc.controller;


import com.cc.entity.Menu;
import com.cc.entity.ResultData;
import com.cc.mapper.MenuMapper;
import com.cc.service.impl.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 金金文
 * @since 2021-01-28
 */
@RestController
@RequestMapping("/cc/menu")

public class MenuController {
    @Autowired
    private MenuServiceImpl menuService;
    @Autowired
    private MenuMapper menuMapper;
    @RequestMapping("getlist")
    public Object getmenu(){
        List<Menu> list = menuService.list(null);
        Map map=new HashMap();
        List<Menu> childrenMenuList = menuMapper.getChildrenMenuList();
        map.put("result",childrenMenuList);
        ResultData.getSuccess(0,"",map);
        Object map1=map;
        return map1;
    }
}

