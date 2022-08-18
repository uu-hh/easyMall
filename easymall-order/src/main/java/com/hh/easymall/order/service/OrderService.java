package com.hh.easymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hh.common.utils.PageUtils;
import com.hh.easymall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author hh
 * @email ${email}
 * @date 2022-08-18 21:47:47
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

