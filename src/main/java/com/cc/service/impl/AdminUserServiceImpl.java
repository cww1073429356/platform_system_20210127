package com.cc.service.impl;

import com.cc.entity.AdminUser;
import com.cc.mapper.AdminUserMapper;
import com.cc.service.AdminUserService;
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
public class AdminUserServiceImpl extends ServiceImpl<AdminUserMapper, AdminUser> implements AdminUserService {

}
