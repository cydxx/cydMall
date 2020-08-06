package com.cydvv.cydmall.product.dao;

import com.cydvv.cydmall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 17:59:49
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
