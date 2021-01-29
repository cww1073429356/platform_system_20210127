package com.cc.mapper;

import com.cc.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 金金文
 * @since 2021-01-28
 */
public interface MenuMapper extends BaseMapper<Menu> {
    public List<Menu> getChildrenMenuList();
}
