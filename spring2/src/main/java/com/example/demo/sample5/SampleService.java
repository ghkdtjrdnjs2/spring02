package com.example.demo.sample5;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SampleService {
	@Autowired
	private Sample5Dao sampleDao;
	
	public void insa(Integer year) {
		LocalDate startDay = LocalDate.of(year,1,1);
		LocalDate endDay = LocalDate.of(year,12,31);
		sampleDao.insa(startDay,endDay);
		
	}

}
