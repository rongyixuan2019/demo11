package com.rongyixuan.consul.controller;

import com.rongyixuan.consul.entity.ConsulConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther rongyixuan
 * @Date 2020/4/20 19:19
 */

//RefreshScope动态刷新配置
@RefreshScope
@RestController
public class ConsulController {
    //注入实体类
    @Autowired
    private ConsulConfigInfo consulConfigInfo;

     @Value("${config.info}")
    private String configInfo;

    @RequestMapping("getConfig")
    public Object getConfig() {
        return configInfo;
    }
}
