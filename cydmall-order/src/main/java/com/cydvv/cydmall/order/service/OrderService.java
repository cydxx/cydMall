package com.cydvv.cydmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cydvv.cydmall.common.utils.PageUtils;
import com.cydvv.cydmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 01:37:46
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

