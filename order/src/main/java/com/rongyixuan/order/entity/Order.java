package com.rongyixuan.order.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * @Auther rongyixuan
 * @Date 2020/4/21 20:08
 */
@Entity
@Data
@Table(name = "job_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String orderno;
    private Integer userId;
    private String username;

}
