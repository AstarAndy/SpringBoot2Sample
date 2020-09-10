package com.acf.sb2.SpringStarter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class BeanTester {

	@Autowired
	private RestTemplate rtWithTimeouts;
	

	private void doIt() {
		;
	}
}
