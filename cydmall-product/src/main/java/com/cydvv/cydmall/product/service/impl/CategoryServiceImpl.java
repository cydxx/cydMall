package com.cydvv.cydmall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cydvv.cydmall.common.utils.PageUtils;
import com.cydvv.cydmall.common.utils.R;
import com.cydvv.cydmall.product.dao.CategoryDao;
import com.cydvv.cydmall.product.entity.CategoryEntity;
import com.cydvv.cydmall.product.service.CategoryService;
import com.cydvv.cydmall.common.utils.Query;

@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 获取商品分类
     * @return
     */
    @Override
    public List<CategoryEntity> selectCategoryTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);

        List<CategoryEntity> collect = categoryEntities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildCategory(categoryEntity,categoryEntities));
                    return categoryEntity;
                })
                .sorted((cat1, cat2) -> (cat1.getSort() == null ? 0 : cat1.getSort()) - (cat2.getSort() == null ? 0 : cat2.getSort()))
                .collect(Collectors.toList());


        return collect;
    }

    /**
     * 获取子分类
     * @param categoryEntity
     * @param categoryEntities
     * @return
     */
    private List<CategoryEntity> getChildCategory(CategoryEntity categoryEntity,List<CategoryEntity> categoryEntities){
        List<CategoryEntity> collect = categoryEntities.stream().filter(cate -> categoryEntity.getCatId() == cate.getParentCid())
                .map(catac -> {
                    catac.setChildren(getChildCategory(catac, categoryEntities));
                    return catac;
                })
                .sorted((cat1, cat2) -> (cat1.getSort() == null ? 0 : cat1.getSort()) - (cat2.getSort() == null ? 0 : cat2.getSort()))
                .collect(Collectors.toList());
        return collect;
    }

}