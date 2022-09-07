package com.hh.easymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hh.common.utils.PageUtils;
import com.hh.easymall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author hh
 * @email ${email}
 * @date 2022-08-17 21:30:24
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);
}

