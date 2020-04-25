package com.rongyixuan.order.service;

import com.rongyixuan.order.dao.OrderDao;
import com.rongyixuan.order.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther rongyixuan
 * @Date 2020/4/21 20:18
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    /**
     * 根据Id，查询order
     * @param id
     * @return
     */
    public List<Order> getOrderById(){
        List<Order> list =  orderDao.findAll();
        return  list;
    }
}
