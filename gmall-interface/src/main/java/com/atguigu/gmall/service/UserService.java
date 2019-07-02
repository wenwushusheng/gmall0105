package com.atguigu.gmall.service;


import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

public interface UserService {

    /**
     * 查询所有数据
     * @return
     */

    List<UserInfo> findAll();

    /**
     * 添加数据
     * @param userInfo
     */
    void addUser(UserInfo userInfo);

    /**
     * 可能需要使用Id主键，也可能使用非主键
     * @param userInfo
     */
    void updUser(UserInfo userInfo);

    /**
     * 可能需要使用Id主键，也可能使用非主键
     * @param userInfo
     */
    void delUser(UserInfo userInfo);

    /**
     *  根据userId 查询用户地址列表
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);


}
