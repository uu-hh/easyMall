package com.hh.easymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hh.common.utils.PageUtils;
import com.hh.easymall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * @author hh
 * @email ${email}
 * @date 2022-08-18 21:51:51
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

