package com.rongyixuan.order.feign;

import com.rongyixuan.userinterface.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther rongyixuan
 * @Date 2020/4/22 21:05
 */
@Component
public class UserFeignClientImpl implements UserFeignClient{
    @Override
    public User getUserById(@RequestParam("id") Integer id) {
        User u = new User();
        u.setId(1);
        u.setUsername("我错了-------------------------------------------1");
        return u;
    }

    @Override
    public User getUserByUser(User user) {
        User u = new User();
        u.setId(1);
        u.setUsername("我错了2");
        return u;
    }

    @Override
    public String getUsernameById(Integer id) {
        User u = new User();
        u.setId(1);
        u.setUsername("我错了3");
        return u+"";
    }
}
