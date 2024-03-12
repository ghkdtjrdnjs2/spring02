package com.example.demo;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.sample1.SampleDao2;

@SpringBootTest
public class Sample2Test {
	@Autowired
	private SampleDao2 sampleDao2;
	
	// findByDeptno 테스트
	@Test
	public void test1() {
		System.out.println(sampleDao2.findByDeptno1(10L));
		System.out.println(sampleDao2.findByDeptno2(10L));
	}
	
	//@Test
	public void Test2() {
		List<Map<String, Object>> list = sampleDao2.findByPosition("부장");
		for(Map<String, Object> map:list) {
			System.out.println(map.get("NAME"));
		}
	}
	
	//@Test
	public void test3() {
		List<Map<String, Object>> list1 = sampleDao2.findByDeptnoAndJob(10L,"MANAGER");
		assertTrue(list1.size()>0);
	}
	
	//@Test
	public void test4() {
		List<Map<String, Object>> list2 = sampleDao2.findByJikAndBu("부장", "영업부");
		assertTrue(list2.size()>=1);
	}
	//@Test
	public void test5() {
		List<Map<String, Object>> list3 = sampleDao2.findByCity("서울", "경기");
		assertTrue(list3.size()>0);
	}

}
