package com.hh.easymall.order.dao;

import com.hh.easymall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author hh
 * @email ${email}
 * @date 2022-08-18 21:47:47
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
