package com.example.demo.sample3;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// annotation은 일종의 클래스
// @Component <- @Controller, @Service, @Repository(@Mapper)
@Controller
public class DeptController {
	@Autowired // DI 의존성 주입 어노테이션
	private DeptDao1 deptDao1;

	@GetMapping("/dept1/list")
	public ModelAndView list() {
		List<Map<String, Object>> list = deptDao1.findAll();
		return new ModelAndView("dept1/list").addObject("list", list);
	}

	@GetMapping("/dept1/read")
	public ModelAndView read(@RequestParam Long deptno) {
		Map<String, Object> dept = deptDao1.findByDeptno(deptno);
		return new ModelAndView("dept1/read").addObject("dept",dept);
	}
}
