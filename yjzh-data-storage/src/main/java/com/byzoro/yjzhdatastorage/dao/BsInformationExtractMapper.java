package com.byzoro.yjzhdatastorage.dao;


import com.byzoro.yjzhdatastorage.entity.JsonResolve;
import com.byzoro.yjzhdatastorage.pojo.BsInformationExtract;
import com.byzoro.yjzhdatastorage.pojo.JsonData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BsInformationExtractMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsInformationExtract record);

    int insertSelective(BsInformationExtract record);

    BsInformationExtract selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsInformationExtract record);

    int updateByPrimaryKey(BsInformationExtract record);

    int insertData( @Param("jsonData") JsonData jsonData,
                   @Param("jsonResolve") JsonResolve jsonResolve);
}