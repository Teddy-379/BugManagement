package com.jit.platform.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 漏洞_实体类
 */
@Data
public class RoleEntity {

    //角色id
    private Integer roleId;
    //角色名称
    private String roleName;
    //角色类型
    private String roleTip;
    //角色信息上传时间
    private LocalDateTime gmtCreate;
    //角色信息修改时间
    private LocalDateTime gmtModify;

}
