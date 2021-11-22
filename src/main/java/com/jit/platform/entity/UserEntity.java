package com.jit.platform.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 漏洞_实体类
 */
@Data
public class UserEntity {

    //用户id
    private Integer userId;
    //用户用户名
    private String userAccount;
    //用户密码
    private String userPass;
    //用户角色
    private String userRole;
    //用户组织
    private String userGroup;
    //用户昵称
    private String userName;
    //用户邮箱
    private String userMail;
    //用户电话
    private String userPhone;
    //用户描述
    private String userTip;
    //用户信息上传时间
    private LocalDateTime gmtCreate;
    //用户信息修改时间
    private LocalDateTime gmtModify;

}
