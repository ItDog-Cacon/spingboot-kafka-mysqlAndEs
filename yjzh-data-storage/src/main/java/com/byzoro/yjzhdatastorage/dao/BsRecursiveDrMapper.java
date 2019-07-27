package com.byzoro.yjzhdatastorage.dao;


import com.byzoro.yjzhdatastorage.entity.JsonResolve;
import com.byzoro.yjzhdatastorage.pojo.BsRecursiveDr;
import com.byzoro.yjzhdatastorage.pojo.JsonData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BsRecursiveDrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsRecursiveDr record);

    int insertSelective(BsRecursiveDr record);

    BsRecursiveDr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsRecursiveDr record);

    int updateByPrimaryKey(BsRecursiveDr record);

    int insertData( @Param("jsonData") JsonData jsonData,
                   @Param("jsonResolve") JsonResolve jsonResolve);
}