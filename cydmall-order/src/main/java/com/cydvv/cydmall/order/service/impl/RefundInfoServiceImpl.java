package com.cydvv.cydmall.order.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cydvv.cydmall.common.utils.PageUtils;
import com.cydvv.cydmall.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.cydvv.cydmall.order.dao.RefundInfoDao;
import com.cydvv.cydmall.order.entity.RefundInfoEntity;
import com.cydvv.cydmall.order.service.RefundInfoService;


@Service("refundInfoService")
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoDao, RefundInfoEntity> implements RefundInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RefundInfoEntity> page = this.page(
                new Query<RefundInfoEntity>().getPage(params),
                new QueryWrapper<RefundInfoEntity>()
        );

        return new PageUtils(page);
    }

}