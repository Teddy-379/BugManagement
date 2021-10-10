package com.jit.platform.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 漏洞_实体类
 */
@Data
public class BugEntity {

    //漏洞id
    private Integer id;
    //漏洞名称
    private String name;
    //漏洞类型
    private String type;
    //漏洞等级
    private Integer level;
    //漏洞地址
    private String addr;
    //漏洞来源
    private String source;
    //漏洞描述
    private String remark;
    //漏洞状态
    private Integer status;
    //漏洞上传时间
    private LocalDateTime gmtCreate;
    //漏洞信息修改时间
    private LocalDateTime gmtModify;

}
