package com.hh.easymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hh.common.utils.PageUtils;
import com.hh.easymall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author hh
 * @email ${email}
 * @date 2022-08-17 21:30:24
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

