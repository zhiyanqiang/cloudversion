package com.zhi.cloud;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * <b>描述</b>：*******
 * </p>
 *
 * @author 支艳强
 * @date 2021/1/30
 */
@Configuration
@ConfigurationProperties(prefix = "feign.service.version")
@Data
public class FeignServiceVersionConfig {
    private Map<String,String> map = new HashMap<>();
}
