package com.byzoro.yjzhdatastorage.dao;


import com.byzoro.yjzhdatastorage.pojo.BsDomainWarning;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BsDomainWarningMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsDomainWarning record);

    int insertSelective(BsDomainWarning record);

    BsDomainWarning selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsDomainWarning record);

    int updateByPrimaryKey(BsDomainWarning record);
}