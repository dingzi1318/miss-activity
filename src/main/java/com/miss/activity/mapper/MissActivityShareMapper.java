package com.miss.activity.mapper;

import com.miss.activity.model.MissActivityShare;
import com.miss.activity.model.MissActivityShareExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MissActivityShareMapper {

    long countByExample(MissActivityShareExample example);

    int deleteByExample(MissActivityShareExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MissActivityShare record);

    int insertSelective(MissActivityShare record);

    List<MissActivityShare> selectByExample(MissActivityShareExample example);

    MissActivityShare selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MissActivityShare record, @Param("example") MissActivityShareExample example);

    int updateByExample(@Param("record") MissActivityShare record, @Param("example") MissActivityShareExample example);

    int updateByPrimaryKeySelective(MissActivityShare record);

    int updateByPrimaryKey(MissActivityShare record);
}