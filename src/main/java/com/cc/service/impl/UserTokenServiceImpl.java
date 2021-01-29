package com.cc.service.impl;

import com.cc.entity.UserToken;
import com.cc.mapper.UserTokenMapper;
import com.cc.service.UserTokenService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 金金文
 * @since 2021-01-28
 */
@Service
public class UserTokenServiceImpl extends ServiceImpl<UserTokenMapper, UserToken> implements UserTokenService {
    public void getUser(){

    }
}
