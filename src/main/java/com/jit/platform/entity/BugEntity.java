package com.jit.platform.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 漏洞_实体类
 */
@Data
public class BugEntity {

    //漏洞id
    private Integer bugId;
    //漏洞名称
    private String bugName;
    //漏洞类型
    private String bugType;
    //漏洞等级
    private Integer bugLevel;
    //漏洞地址
    private String bugAddr;
    //漏洞来源
    private String bugSource;
    //漏洞描述
    private String bugTip;
    //漏洞状态
    private Integer bugFlag;
    //审核时间
    private LocalDateTime judgeTime;
    //修复时间
    private LocalDateTime fixTime;
    //漏洞时效
    private LocalDateTime deadLine;
    //漏洞上传时间
    private LocalDateTime gmtCreate;
    //漏洞信息修改时间
    private LocalDateTime gmtModify;

}
