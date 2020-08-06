package com.cydvv.cydmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cydvv.common.utils.PageUtils;
import com.cydvv.cydmall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 17:58:15
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

