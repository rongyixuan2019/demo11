package com.rongyixuan.order.controller;

import com.rongyixuan.order.entity.Order;
import com.rongyixuan.order.feign.UserFeignClient;
import com.rongyixuan.order.service.OrderService;
import com.rongyixuan.userinterface.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther rongyixuan
 * @Date 2020/4/21 20:16
 */
@RestController
@RequestMapping("/order/")
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private RestTemplate restTemplate;

    @Resource
    private UserFeignClient userFeignClient;

    /**
     * 根据Id查询订单
     * @param
     * @return
     */
    @RequestMapping("list")
    public Object getOrderById(@RequestParam("id") Integer id){
        //Order order = orderService.getOrderById(id);
        //service-user是被调用服务名称，spring.application.name的名称
       // User user = restTemplate.getForObject("http://user/user/getUserById?id="+order.getUserId(), User.class);
       //User user1 = userFeignClient.getUserById(id);
        List<Order> list = orderService.getOrderById();
        User u = new User();
        u.setId(id);
        User user = userFeignClient.getUserById(u.getId());
        log.info("user:{}",user);
       return list+"=="+user;
    }
}
