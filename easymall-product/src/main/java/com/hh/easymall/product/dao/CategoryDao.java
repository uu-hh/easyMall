package com.hh.easymall.product.dao;

import com.hh.easymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author hh
 * @email ${email}
 * @date 2022-08-17 21:30:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
