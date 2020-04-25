package com.rongyixuan.order.feign;

import com.rongyixuan.userinterface.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "suser" , fallback = UserFeignClientImpl.class)
public interface UserFeignClient {
    @RequestMapping("/user/getUserById")
    public User getUserById(@RequestParam("id") Integer id);

    @RequestMapping("/user/getUserByUser")
    public User getUserByUser(/*@RequestBody*/ User user);

    /**
     * 根据Id，查询用户名称
     * @param id
     * @return
     */
    @RequestMapping("/user/getUsernameById")
    public String getUsernameById(@RequestParam("id") Integer id);
}
