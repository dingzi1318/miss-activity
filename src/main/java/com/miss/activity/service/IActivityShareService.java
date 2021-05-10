package com.miss.activity.service;

import com.miss.activity.model.MissActivityShare;

public interface IActivityShareService {

    /**
     * 新增活动分享记录
     *
     * @param record
     * @return
     */
    MissActivityShare insert(MissActivityShare record);

    /**
     * 查询活动分享记录
     *
     * @param id
     * @return
     */
    MissActivityShare selectById(Long id);
}
