package com.zhi.cloud;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import io.jmnarloch.spring.cloud.ribbon.support.RibbonFilterContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * <b>描述</b>：ribbon过滤设置，根据appName和版本过滤，实现同一应用不同版本配置
 * </p>
 *
 * @author 支艳强
 * @date 2021/1/30
 */
@Slf4j
@Component
public class RibbonRequestInterceptor implements RequestInterceptor {
    @Autowired
    private FeignServiceVersionConfig feignServiceVersionConfig;

    @Override
    public void apply(RequestTemplate template) {
        Map<String, String> map = feignServiceVersionConfig.getMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String appName = entry.getKey();
            String appVersion = entry.getValue();
            RibbonFilterContextHolder.getCurrentContext()
                    .add("app-name", appName)
                    .add("version",appVersion);
        }
    }
}
