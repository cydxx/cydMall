package com.cydvv.cydmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cydvv.common.utils.PageUtils;
import com.cydvv.cydmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 17:59:49
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

