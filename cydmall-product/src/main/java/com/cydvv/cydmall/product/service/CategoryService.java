package com.cydvv.cydmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cydvv.cydmall.common.utils.PageUtils;
import com.cydvv.cydmall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 17:59:49
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查询分类树
     * @return
     */
    List<CategoryEntity> selectCategoryTree();

    /**
     * 逻辑删除
     * @param catIds
     */
    void deleteCategoryByIds(Long[] catIds);
}

