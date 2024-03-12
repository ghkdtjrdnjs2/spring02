package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import com.example.demo.sample1.*;

@SpringBootTest
public class Sample1Test {
	@Autowired
	private SampleDao sampleDao;
	
	//@Test
	public void findJobTest() {
		sampleDao.findJob();
	}
	
	// 결과가 1개 -> 없으면 null
	// 결과가 여러개 -> 없어도 List가 null이 아니라 비어있는 리스트
	//@Test
	public void findLaneTest() {
		assertEquals(5, sampleDao.findLine().size());
	}
	
	// Map : 데이터의 이름과 값의 쌍
	//		 객체와 역할은 동일...클래스(설계도)없이 작업
	//@Test
	public void mapTest() {
		// irum은 홍길동, school는 학익고
		/*
		 * const map = {irum:'홍길동', school:'학익고'};
		 */
		Map<String,String> map1 = new HashMap<>();
		map1.put("irum", "홍길동");
		map1.put("schoole", "학익고");
		System.out.println(map1);
		
		// irum : 홍길동, nai:20
		Map<String,Object> map2 = new HashMap<>();
		map2.put("irum", "홍길동");
		map2.put("nai", 20);
		System.out.println(map2);		
	}
	
	//@Test
	public void findAll1Test() {
		List<Map<String, Object>> list = sampleDao.findAll1();
		for(Map<String, Object>m:list) {
			System.out.println(m);
		}
	}
	
	// 값 여러 개 담기 -> 클래스를 만들어서 객체 생성, Map
		// - 클래스를 만들기
		// - Map 사용 -> 간편하지만 오타에 약하다
		// @Test
	public void mapTest1() {
		/* JS의 객체 -> 자바의 Map
		const map = {
			  pname : '싸만코',
			 price : 2000
		  };
		*/
		Map<String, Object> map = new HashMap<>();
		map.put("pname", "싸만코");
		map.put("price", 2000);
		System.out.println(map);	
	}
		
	// @Test
	public void countTest() {
		Map<String, Object> map = sampleDao.count();
		System.out.println(map);
	}
	
	@Test
	public void maxAndMinTest() {
		Map<String, Object> map = sampleDao.maxAndMin();
		System.out.println(map);
	}
	
}

