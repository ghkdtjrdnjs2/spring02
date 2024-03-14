package com.example.demo.sample4;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DsrDao {
	@Select("select lane, round(count(case win when 'TRUE' then 1 end)/count(*),4) as rate, round((sum(kills)+sum(assists))/sum(deaths),2) as kda, round(avg(gold)) as gold from dsr where id=17 group by lane")
	public List<Map<String, Object>> findByID(Long id);
}
