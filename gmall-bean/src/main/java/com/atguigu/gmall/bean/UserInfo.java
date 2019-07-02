package com.atguigu.gmall.bean;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zhangchunyu
 * @create 2019-07-02 13:25
 */
@Data
@ToString
public class UserInfo implements Serializable {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY) // mysql=IDENTITY 表示获取主键自增 oracle=AUTO
    private String id;
    @Column
    private String loginName;
    @Column
    private String nickName;
    @Column
    private String passwd;
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;
    @Column
    private String headImg;
    @Column
    private String userLevel;
}
