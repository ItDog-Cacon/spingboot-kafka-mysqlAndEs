package com.byzoro.yjzhdatastorage.dao;


import com.byzoro.yjzhdatastorage.entity.JsonResolve;
import com.byzoro.yjzhdatastorage.pojo.BsForceResolve;
import com.byzoro.yjzhdatastorage.pojo.JsonData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BsForceResolveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsForceResolve record);

    int insertSelective(BsForceResolve record);

    BsForceResolve selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsForceResolve record);

    int updateByPrimaryKey(BsForceResolve record);

    int insertData(@Param("jsonData") JsonData jsonData,
                   @Param("jsonResolve") JsonResolve jsonResolve);
}