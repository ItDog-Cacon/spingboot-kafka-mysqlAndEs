package com.byzoro.yjzhdatastorage.dao;


import com.byzoro.yjzhdatastorage.entity.JsonResolve;
import com.byzoro.yjzhdatastorage.pojo.BsCache;
import com.byzoro.yjzhdatastorage.pojo.BsForceResolve;
import com.byzoro.yjzhdatastorage.pojo.JsonData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BsCacheMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsCache record);

    int insertSelective(BsCache record);

    BsCache selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsCache record);

    int updateByPrimaryKey(BsCache record);

    int insertData(@Param("jsonResolve") JsonResolve jsonResolve,
                   @Param("jsonData") JsonData jsonData);
}