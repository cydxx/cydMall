package com.cydvv.cydmall.coupon.dao;

import com.cydvv.cydmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 17:55:12
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
