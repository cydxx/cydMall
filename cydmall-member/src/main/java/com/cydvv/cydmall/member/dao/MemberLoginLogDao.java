package com.cydvv.cydmall.member.dao;

import com.cydvv.cydmall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 17:58:15
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
