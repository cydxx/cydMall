package com.cydvv.cydmall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import com.cydvv.cydmall.common.valid.AddGroup;
import com.cydvv.cydmall.common.valid.ListValue;
import com.cydvv.cydmall.common.valid.UpdateGroup;
import com.cydvv.cydmall.common.valid.UpdateStatus;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * 品牌
 * 
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 17:59:49
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@NotNull(message = "编辑不能为空",groups = {UpdateGroup.class})
	@Null(message = "新增必须是空",groups = {AddGroup.class})
	@TableId(type = IdType.AUTO)
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank(message = "品牌名称不能为空",groups = {AddGroup.class,UpdateGroup.class})
	private String name;
	/**
	 * 品牌logo地址
	 */
	@NotNull(groups = {AddGroup.class})
	@URL(message = "logo必须是一个合法的url",groups = {AddGroup.class,UpdateGroup.class})
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@ListValue(values = {0,1},message = "必须是0或1",groups = {AddGroup.class, UpdateStatus.class})
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@Pattern(regexp = "^[a-zA-Z]$",message = "检索字母必须是一个字母",groups = {AddGroup.class,UpdateGroup.class})
	private String firstLetter;
	/**
	 * 排序
	 */
	@Min(value = 0,message = "排序必须大于0的整数",groups = {AddGroup.class,UpdateGroup.class})
	private Integer sort;

}
