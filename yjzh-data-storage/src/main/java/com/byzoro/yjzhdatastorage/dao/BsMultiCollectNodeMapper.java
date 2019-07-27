package com.byzoro.yjzhdatastorage.dao;


import com.byzoro.yjzhdatastorage.entity.JsonResolve;
import com.byzoro.yjzhdatastorage.pojo.BsMultiCollectNode;
import com.byzoro.yjzhdatastorage.pojo.JsonData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BsMultiCollectNodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsMultiCollectNode record);

    int insertSelective(BsMultiCollectNode record);

    BsMultiCollectNode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsMultiCollectNode record);

    int updateByPrimaryKey(BsMultiCollectNode record);

    int insertData(@Param("jsonData") JsonData jsonData,
                   @Param("jsonResolve") JsonResolve jsonResolve);
}