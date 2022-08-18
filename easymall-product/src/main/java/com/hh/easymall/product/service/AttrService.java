package com.hh.easymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hh.common.utils.PageUtils;
import com.hh.easymall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author hh
 * @email ${email}
 * @date 2022-08-17 21:30:24
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

