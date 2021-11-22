package com.jit.platform.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 漏洞_实体类
 */
@Data
public class GroupEntity {

    //组织id
    private Integer groupId;
    //组织名称
    private String groupName;
    //组织排序
    private String groupSort;
    //组织上级
    private String groupUp;
    //组织描述
    private String groupTip;
    //组织信息上传时间
    private LocalDateTime gmtCreate;
    //组织信息修改时间
    private LocalDateTime gmtModify;

}
