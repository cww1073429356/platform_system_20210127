package com.cc.service.impl;

import com.cc.entity.Customer;
import com.cc.mapper.CustomerMapper;
import com.cc.service.CustomerService;
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
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
