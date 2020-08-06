package com.cydvv.cydmall.order.dao;

import com.cydvv.cydmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 01:37:46
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
