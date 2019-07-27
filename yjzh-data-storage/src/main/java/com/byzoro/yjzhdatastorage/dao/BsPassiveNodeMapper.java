package com.byzoro.yjzhdatastorage.dao;


import com.byzoro.yjzhdatastorage.entity.JsonResolve;
import com.byzoro.yjzhdatastorage.pojo.BsPassiveNode;
import com.byzoro.yjzhdatastorage.pojo.JsonData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BsPassiveNodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsPassiveNode record);

    int insertSelective(BsPassiveNode record);

    BsPassiveNode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsPassiveNode record);

    int updateByPrimaryKey(BsPassiveNode record);

    int insertData(@Param("jsonData") JsonData jsonData,
                   @Param("jsonResolve") JsonResolve jsonResolve);
}