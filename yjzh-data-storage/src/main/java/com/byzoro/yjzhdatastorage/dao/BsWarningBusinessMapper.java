package com.byzoro.yjzhdatastorage.dao;


import com.byzoro.yjzhdatastorage.entity.JsonResolve;
import com.byzoro.yjzhdatastorage.pojo.BsWarningBusiness;
import com.byzoro.yjzhdatastorage.pojo.JsonData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BsWarningBusinessMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsWarningBusiness record);

    int insertSelective(BsWarningBusiness record);

    BsWarningBusiness selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsWarningBusiness record);

    int updateByPrimaryKey(BsWarningBusiness record);

    int insertData(@Param("jsonData") JsonData jsonData,
                   @Param("jsonResolve") JsonResolve jsonResolve);
}