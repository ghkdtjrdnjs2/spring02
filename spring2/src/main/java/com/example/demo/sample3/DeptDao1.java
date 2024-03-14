package com.example.demo.sample3;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DeptDao1 {
	@Select("select * from dept")
	public List<Map<String, Object>> findAll();
	
	@Select("select * from dept where deptno=#{deptno}")
	public Map<String, Object> findByDeptno(Long deptno);
	
	
}
