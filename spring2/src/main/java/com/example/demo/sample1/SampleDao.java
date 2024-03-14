package com.example.demo.sample1;

import java.util.*;

import org.apache.ibatis.annotations.*;

@Mapper
public interface SampleDao {
	// select job from emp
	@Select("select distinct job from emp order by 1 desc")
	public List<String> findJob();
	
	// dsr테이블에 lane을 출력하는 sql과 메소드를 만들고 테스트하시오
	@Select("select distinct lane from dsr")
	public List<String> findLine();
	
	// 여러 컬럼을 읽어오는 경우에 클래스 또는 Map
	@Select("select * from dept")
	public List<Map<String, Object>>findAll1();
	
	@Select("select count(*) as count, avg(sal) as sal from emp")
	public Map<String, Object> count();
	
	// emp에서 최대, 최소 급여를 출력하는 메소드를 만들고 테스트하시오
	@Select("select max(sal) as maxSal, min(sal) as minSal from emp")
	public Map<String, Object> maxAndMin();
	
}

















