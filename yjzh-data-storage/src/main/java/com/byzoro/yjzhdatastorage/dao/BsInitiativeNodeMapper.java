package com.byzoro.yjzhdatastorage.dao;


import com.byzoro.yjzhdatastorage.entity.JsonResolve;
import com.byzoro.yjzhdatastorage.pojo.BsInitiativeNode;
import com.byzoro.yjzhdatastorage.pojo.JsonData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BsInitiativeNodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsInitiativeNode record);

    int insertSelective(BsInitiativeNode record);

    BsInitiativeNode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsInitiativeNode record);

    int updateByPrimaryKey(BsInitiativeNode record);

    int insertData(@Param("jsonData") JsonData jsonData,
                   @Param("jsonResolve") JsonResolve jsonResolve);
}