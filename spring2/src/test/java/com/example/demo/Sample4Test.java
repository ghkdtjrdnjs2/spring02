package com.example.demo;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.sample1.SampleDao4;


import lombok.extern.slf4j.Slf4j;

// 롬복이 slf4j의 객체 log를 주입해준다
@Slf4j
@SpringBootTest
public class Sample4Test {
	@Autowired
	private SampleDao4 sampleDao4;

	//@Test
	public void findCountByDeptnoTest() {
		assertTrue(sampleDao4.findCountByDeptno().size() > 0);
		List<Map<String, Object>> list = sampleDao4.findCountByDeptno();
		for (Map<String, Object> m : list) {
			log.info("{}", m);
		}
	}
	
	//@Test
	public void findGoldByLaneTest() {
		assertTrue(sampleDao4.findGoldByLane(17L).size()>0);
		// forEach : 리스트의 원소를 꺼낸다
		// 리스트의 원소 a -> 코드
		// 자바로 치면 for(Map<Strimg, Object> a:list)
		sampleDao4.findGoldByLane(17L).forEach(a->log.info("{}", a));
	}
	
	//@Test
	public void test3() {
		sampleDao4.findDpsByLane(17L).forEach(b->log.info("{}",b));
	}
	
	@Test
	public void test4() {
		sampleDao4.find17ByLane(17L).forEach(c->log.info("{}",c));
	}
}
