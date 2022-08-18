package com.hh.easymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hh.common.utils.PageUtils;
import com.hh.easymall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author hh
 * @email ${email}
 * @date 2022-08-18 21:39:03
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

