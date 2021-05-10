package com.miss.activity.service.impl;

import com.miss.activity.mapper.MissActivityShareMapper;
import com.miss.activity.model.MissActivityShare;
import com.miss.activity.service.IActivityShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ActivityShareServiceImpl implements IActivityShareService {

    @Autowired
    private MissActivityShareMapper activityShareMapper;

    @Override
    public MissActivityShare insert(MissActivityShare record) {
        record.setCreateTime(new Date());
        activityShareMapper.insert(record);
        return record;
    }

    @Override
    public MissActivityShare selectById(Long id) {
        return activityShareMapper.selectByPrimaryKey(id);
    }
}
