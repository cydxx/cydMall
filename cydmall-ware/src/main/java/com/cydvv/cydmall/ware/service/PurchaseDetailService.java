package com.cydvv.cydmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cydvv.common.utils.PageUtils;
import com.cydvv.cydmall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 18:01:02
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

