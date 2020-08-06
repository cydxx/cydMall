package com.cydvv.cydmall.member.dao;

import com.cydvv.cydmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 17:58:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
