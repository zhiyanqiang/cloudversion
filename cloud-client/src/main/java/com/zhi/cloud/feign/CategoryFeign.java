package com.zhi.cloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>
 * <b>描述</b>：*******
 * </p>
 *
 * @author 支艳强
 * @date 2021/1/30
 */
@FeignClient(name = "cloud-category")
public interface CategoryFeign {
    @GetMapping("/sayHello/")
    public String sayHello();
}
