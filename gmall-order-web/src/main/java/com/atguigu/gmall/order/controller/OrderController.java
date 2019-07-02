package com.atguigu.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    // 自动注入，从spring 同一个容器中！
    //@Autowired
    @Reference
    private UserService userService;

    @RequestMapping("trade")
    public List<UserAddress> trade(String userId){
        // 调用服务层
        return userService.getUserAddressList(userId);
    }
    //因为依赖了interface接口,可以装配service,但是本项目没有实现类,所以运行的是时候报错了





}
