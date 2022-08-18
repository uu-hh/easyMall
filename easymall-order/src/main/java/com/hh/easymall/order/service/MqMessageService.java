package com.hh.easymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hh.common.utils.PageUtils;
import com.hh.easymall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author hh
 * @email ${email}
 * @date 2022-08-18 21:47:47
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

