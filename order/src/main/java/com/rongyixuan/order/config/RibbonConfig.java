package com.rongyixuan.order.config;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther rongyixuan
 * @Date 2020/4/21 20:10
 */
@Configuration
public class RibbonConfig {
    /**
     * restTemplate发送请求
     * LoadBalanced 注解可以负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 指定负载均衡算法
     * @return
     */
    @Bean
    public IRule iRule(){
        //随机算法
//        return new RandomRule();
        return  new RoundRobinRule();
        /** 随机选取一个服务，进行访问 **/
        //return new RandomRule();
        /** 如果一个服务挂了，会尝试几次访问，如果几次访问失败后，下次就跳过失败的服务。**/
        //return  new RetryRule();
        /** 当高并发时，会选中最空闲当服务 **/
        //return  new BestAvailableRule();
        /** 按照权重访问 **/
        //return  new WeightedResponseTimeRule();
        /** 先过滤清单再轮训 **/
        //return  new PredicateBasedRule();
    }
}
