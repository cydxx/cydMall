package com.cydvv.cydmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cydvv.cydmall.common.utils.PageUtils;
import com.cydvv.cydmall.common.utils.R;

import com.cydvv.cydmall.product.dao.AttrAttrgroupRelationDao;
import com.cydvv.cydmall.product.entity.AttrAttrgroupRelationEntity;
import com.cydvv.cydmall.product.service.AttrAttrgroupRelationService;
import com.cydvv.cydmall.common.utils.Query;

@Service("attrAttrgroupRelationService")
public class AttrAttrgroupRelationServiceImpl extends ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelationEntity> implements AttrAttrgroupRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrAttrgroupRelationEntity> page = this.page(
                new Query<AttrAttrgroupRelationEntity>().getPage(params),
                new QueryWrapper<AttrAttrgroupRelationEntity>()
        );

        return new PageUtils(page);
    }

}