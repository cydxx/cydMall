package com.cydvv.cydmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cydvv.common.utils.PageUtils;
import com.cydvv.cydmall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 17:55:12
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

