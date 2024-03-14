package com.example.demo;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.sample2.DeptDao;

@SpringBootTest
public class DeptDaoTest {
	@Autowired
	private DeptDao deptDao;
	
	//@Test
	public void initTest() {
		assertNotNull(deptDao);
	}
	
	//@Test
	public void test1() {
		deptDao.findPosition();
	}
	
	//@Test
	public void test2() {
		deptDao.countGroupByPosition();
	}
	
	@Test
	public void test3() {
		deptDao.countGroupByPosition2();
	}
	
}
