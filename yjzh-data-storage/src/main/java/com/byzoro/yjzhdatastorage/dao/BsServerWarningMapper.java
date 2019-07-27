package com.byzoro.yjzhdatastorage.dao;


import com.byzoro.yjzhdatastorage.pojo.BsServerWarning;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BsServerWarningMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsServerWarning record);

    int insertSelective(BsServerWarning record);

    BsServerWarning selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsServerWarning record);

    int updateByPrimaryKey(BsServerWarning record);
}