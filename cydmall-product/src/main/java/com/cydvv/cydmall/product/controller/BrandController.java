package com.cydvv.cydmall.product.controller;

import java.util.Arrays;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.cydvv.cydmall.common.valid.AddGroup;
import com.cydvv.cydmall.common.valid.UpdateGroup;
import com.cydvv.cydmall.common.valid.UpdateStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cydvv.cydmall.product.entity.BrandEntity;
import com.cydvv.cydmall.product.service.BrandService;
import com.cydvv.cydmall.common.utils.PageUtils;
import com.cydvv.cydmall.common.utils.R;

import javax.validation.Valid;


/**
 * 品牌
 *
 * @author chengyadong
 * @email cydvvxx@sina.com
 * @date 2020-08-06 17:59:49
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:brand:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    //@RequiresPermissions("product:brand:info")
    public R info(@PathVariable("brandId") Long brandId){
		BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:brand:save")
    public R save(@Validated(AddGroup.class) @RequestBody BrandEntity brand, BindingResult result){
//        if (result.hasErrors()){
//            JSONObject ii = new JSONObject();
//            result.getFieldErrors().forEach(item ->{
//                ii.put(item.getField(),item.getDefaultMessage());
//            });
//            return R.error(400,"参数不合法").put("data",ii);
//        }else {
            brandService.save(brand);
//        }
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:brand:update")
    public R update(@Validated(UpdateGroup.class) @RequestBody BrandEntity brand){
		brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 修改状态
     */
    @RequestMapping("/update/status")
    //@RequiresPermissions("product:brand:update")
    public R updateStatus(@Validated(UpdateStatus.class) @RequestBody BrandEntity brand){
        brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:brand:delete")
    public R delete(@RequestBody Long[] brandIds){
		brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
