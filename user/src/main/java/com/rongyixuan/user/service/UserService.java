package com.rongyixuan.user.service;

import com.rongyixuan.userinterface.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Auther rongyixuan
 * @Date 2020/4/21 19:55
 */
@Service
public class UserService {
    /**
     * 根据Id，查询user
     * @param id
     * @return
     */
    public User getUserById(Integer id){
        User user = new User();
        user.setId(id);
        user.setUsername("荣毅宣:"+id);
        return  user;
    }

    /**
     * 根据Id，查询用户名称
     * @param id
     * @return
     */
    public String getUsernameById(Integer id){
        User user = getUserById(id);
        return user.getUsername();
    }
}
