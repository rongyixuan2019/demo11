package com.rongyixuan.consul.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther rongyixuan
 * @Date 2020/4/20 19:28
 */
//配置类
//JsonIgnoreProperties("$$beanFactory")
@Configuration
@ConfigurationProperties(prefix = "config")
public class ConsulConfigInfo {

    private String name;
    private String info;

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "ConsulConfigInfo{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public ConsulConfigInfo() {
        super();
    }
}
