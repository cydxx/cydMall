package com.cydvv.cydmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.cydvv.cydmall.common.utils.PageUtils;
import com.cydvv.cydmall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 17:55:12
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

