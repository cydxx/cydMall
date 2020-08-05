package com.cydvv.cydmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cydvv.cydmall.common.utils.PageUtils;
import com.cydvv.cydmall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 01:37:46
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

