package com.byzoro.yjzhdatastorage.dao;


import com.byzoro.yjzhdatastorage.entity.JsonResolve;
import com.byzoro.yjzhdatastorage.pojo.BsIterationDr;
import com.byzoro.yjzhdatastorage.pojo.JsonData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BsIterationDrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsIterationDr record);

    int insertSelective(BsIterationDr record);

    BsIterationDr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsIterationDr record);

    int updateByPrimaryKey(BsIterationDr record);

    int insertData(@Param("jsonData") JsonData jsonData,
                   @Param("jsonResolve") JsonResolve jsonResolve);
}