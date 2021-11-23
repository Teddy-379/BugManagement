package com.jit.platform.mapper;

import com.jit.platform.entity.BugEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 接口 对应xml中的SQL操作
 */
@Repository
public interface BugMapper {

    /**
     * 保存数据
     */
    public void save();

    /**
     * 分页查询
     * @param bugEntity
     * @return
     */
    public List<BugEntity> page(BugEntity bugEntity);
}
