package com.example.demo.sample5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Sample5Controller {
	@Autowired
	private SampleService service;
	
	@GetMapping("/insa")
	public ModelAndView sample(Integer year) {
		service.insa(year);
		return null;
	}
}
