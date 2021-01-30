package com.zhi.cloud.web;

import com.zhi.cloud.feign.BrandFeign;
import com.zhi.cloud.feign.CategoryFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * <b>描述</b>：*******
 * </p>
 *
 * @author 支艳强
 * @date 2021/1/30
 */
@RestController
public class ClientController {
    @Autowired
    private CategoryFeign categoryFeign;

    @Autowired
    private BrandFeign brandFeign;
    @GetMapping("/clent/say")
    public String clientSay(){
        String categoryHello = categoryFeign.sayHello();
        String brandHello = brandFeign.sayHello();
        return categoryHello+"<<>>"+brandHello;
    }
}
