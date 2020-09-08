package com.acf.sb2.SpringStarter2.comps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.acf.sb2.SpringStarter2.configs.RestTemplateConfig;

public class CustomRestTemplate {
	
	@Autowired
	RestTemplateConfig rtConfig;
	
	@Bean
	RestTemplate getTemplate() {
		return new RestTemplate(rtConfig.getClientHttpRequestFactory());
	}

}
