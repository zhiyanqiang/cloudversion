package com.zhi.cloud.web;

import org.springframework.beans.factory.annotation.Value;
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
public class CategoryController {
    @Value("${spring.application.version}")
    private String version;
    @GetMapping("sayHello")
    private String sayHello(){
        return "1.1修改category--->" + version;
    }
}
