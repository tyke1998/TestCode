package com.how2java.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.how2java.boot.pojo.student;

@Mapper
public interface StudentMapper {

	@Select("select * from student")
	List<student> findAll();
}