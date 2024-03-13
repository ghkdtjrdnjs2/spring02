package com.example.demo.sample1;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

// @Repository : 스프링이 dao빈을 생성

// 마이바티스가 dao를 생성해서 스프링에 등록
@Mapper
public interface SampleDao4 {
	@Select("select deptno, count(*) as cnt from emp2 group by deptno order by 2 desc")
	public List<Map<String, Object>> findCountByDeptno();
	
	// 챔피언의 라인별 골드량
	@Select("select lane, round(avg(gold),2) as avg from dsr where id=#{id} group by lane having count(*)>=100")
	public List<Map<String, Object>> findGoldByLane(Long id);
	
	@Select("select lane, round(avg(damagedealt)/avg(duration),2) as dps from dsr where id=#{id} group by lane")
	public List<Map<String, Object>> findDpsByLane(Long id);
	
	@Select("select lane, round(count(case win when 'TRUE' then 1 end)/count(*)*100,2) as 승율, round(sum(kills+assists)/sum(deaths),2) as kda, round(avg(gold)) as gold from dsr where id=#{id} group by lane")
	public List<Map<String, Object>> find17ByLane(Long id);
}
