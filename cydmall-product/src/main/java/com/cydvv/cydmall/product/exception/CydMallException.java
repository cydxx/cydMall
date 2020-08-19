package com.cydvv.cydmall.product.exception;


import com.alibaba.fastjson.JSONObject;
import com.cydvv.cydmall.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.cydvv.cydmall.product.controller")
public class CydMallException {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleVaildException(MethodArgumentNotValidException e){
        JSONObject  ii = new JSONObject();
        e.getBindingResult().getFieldErrors().forEach(item -> {
            ii.put(item.getField(),item.getDefaultMessage());
        });
        return R.error(400,"参数异常").put("data",ii);
    }

    @ExceptionHandler(value = Exception.class)
    public R globalException(){
        return R.error();
    }
}
