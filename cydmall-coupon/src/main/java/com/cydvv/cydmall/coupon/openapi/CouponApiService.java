package com.cydvv.cydmall.coupon.openapi;

import com.cydvv.cydmall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("cydmall-order")
public interface CouponApiService {

    @RequestMapping("/order/order/test")
    public R test();
}
