package com.byzoro.yjzhdatastorage.dao;


import com.byzoro.yjzhdatastorage.entity.JsonResolve;
import com.byzoro.yjzhdatastorage.pojo.BsIteration;
import com.byzoro.yjzhdatastorage.pojo.JsonData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BsIterationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsIteration record);

    int insertSelective(BsIteration record);

    BsIteration selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsIteration record);

    int updateByPrimaryKey(BsIteration record);

    int insertData(@Param("jsonResolve") JsonResolve jsonResolve,
                   @Param("jsonData") JsonData jsonData);
}