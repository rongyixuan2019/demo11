package com.rongyixuan.order.dao;

import com.rongyixuan.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderDao extends JpaRepository<Order, Integer>, JpaSpecificationExecutor<Order> {
}
