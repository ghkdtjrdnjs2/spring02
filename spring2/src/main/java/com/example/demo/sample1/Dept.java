package com.example.demo.sample1;

import lombok.Data;

// 

// 생성자를 제외하고 세터, 게터 등을 한 방에 지정하는 어노테이션
@Data
public class Dept {
	private Long deptno;
	private String dname;
	private String loc;
}
