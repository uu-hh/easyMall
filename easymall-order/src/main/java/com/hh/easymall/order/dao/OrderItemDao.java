package com.hh.easymall.order.dao;

import com.hh.easymall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author hh
 * @email ${email}
 * @date 2022-08-18 21:47:47
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
