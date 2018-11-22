package com.example.demo.mapper;


import com.example.demo.entity.PersonInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PersonInfoMapper {
    //int countByExample(PersonInfoExample example);

    //int deleteByExample(PersonInfoExample example);

    int deleteByPrimaryKey(String personNo);

    int insert(PersonInfo record);

    int insertSelective(PersonInfo record);

    //List<PersonInfo> selectByExample(PersonInfoExample example);

    PersonInfo selectByPrimaryKey(String personNo);

    //int updateByExampleSelective(@Param("record") PersonInfo record, @Param("example") PersonInfoExample example);

    //int updateByExample(@Param("record") PersonInfo record, @Param("example") PersonInfoExample example);

    int updateByPrimaryKeySelective(PersonInfo record);

    int updateByPrimaryKey(PersonInfo record);
}