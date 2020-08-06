package com.cydvv.cydmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cydvv.cydmall.common.utils.PageUtils;
import com.cydvv.cydmall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 01:37:46
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

