package com.cydvv.cydmall.order.service.impl;

import com.cydvv.cydmall.common.utils.PageUtils;
import com.cydvv.cydmall.common.utils.Query;
import com.cydvv.cydmall.order.dao.OrderItemDao;
import com.cydvv.cydmall.order.entity.OrderItemEntity;
import com.cydvv.cydmall.order.service.OrderItemService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("orderItemService")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemDao, OrderItemEntity> implements OrderItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderItemEntity> page = this.page(
                new Query<OrderItemEntity>().getPage(params),
                new QueryWrapper<OrderItemEntity>()
        );

        return new PageUtils(page);
    }

}