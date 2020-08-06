package com.cydvv.cydmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cydvv.common.utils.PageUtils;
import com.cydvv.cydmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 17:58:15
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

