package com.rongyixuan.userinterface.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther rongyixuan
 * @Date 2020/4/21 20:01
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
}
