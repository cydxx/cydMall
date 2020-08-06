package com.cydvv.cydmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.cydvv.cydmall.common.utils.PageUtils;
import com.cydvv.cydmall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 17:55:12
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

