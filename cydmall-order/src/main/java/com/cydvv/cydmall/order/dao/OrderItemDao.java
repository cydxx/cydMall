package com.cydvv.cydmall.order.dao;

import com.cydvv.cydmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 01:37:46
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
