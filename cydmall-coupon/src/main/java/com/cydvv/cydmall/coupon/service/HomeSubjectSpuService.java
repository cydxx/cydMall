package com.cydvv.cydmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cydvv.common.utils.PageUtils;
import com.cydvv.cydmall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 17:55:12
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

