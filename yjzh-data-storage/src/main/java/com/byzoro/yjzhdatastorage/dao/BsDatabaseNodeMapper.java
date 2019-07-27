package com.byzoro.yjzhdatastorage.dao;


import com.byzoro.yjzhdatastorage.entity.JsonResolve;
import com.byzoro.yjzhdatastorage.pojo.BsDatabaseNode;
import com.byzoro.yjzhdatastorage.pojo.JsonData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BsDatabaseNodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsDatabaseNode record);

    int insertSelective(BsDatabaseNode record);

    BsDatabaseNode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsDatabaseNode record);

    int updateByPrimaryKey(BsDatabaseNode record);

    int insertData(@Param("jsonData") JsonData jsonData,
                   @Param("jsonResolve") JsonResolve jsonResolve);
}