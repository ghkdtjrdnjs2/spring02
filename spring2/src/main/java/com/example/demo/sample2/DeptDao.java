package com.example.demo.sample2;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptDao {
	// emp2에서 distinct 직위
	public List<String> findPosition();
	
	// emp2에서 직위별 인원수
	public List<Long> countGroupByPosition();
	
	// emp2에서 직위, 인원수
	public List<Map<String, Object>> countGroupByPosition2();
}
