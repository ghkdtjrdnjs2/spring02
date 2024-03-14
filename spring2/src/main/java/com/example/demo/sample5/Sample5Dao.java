package com.example.demo.sample5;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Sample5Dao {
	@Select("select * from insa where ibsadate between #{startDay} and #{endDay}")
	public List<Map<String, Object>> insa(LocalDate startDay, LocalDate endDay);

}
