package com.acf.sb2.SpringStarter2.configs;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	@Value( "${rest.config.connection.timeout}" )
	private long connTimeout;

	@Value( "${rest.config.read.timeout}" )
	private long readTimeout;
	 
/*
 *	Legacy way of setting timeouts on RestTemplate
	private ClientHttpRequestFactory getClientHttpRequestFactory() {
	    HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
	    
	    clientHttpRequestFactory.setConnectTimeout(connTimeout);
	    clientHttpRequestFactory.setReadTimeout(readTimeout);
	    
	    return clientHttpRequestFactory;
	}
*/
	
	@Bean
	RestTemplate restTemplateWithTimeout() {
		return
			    new RestTemplateBuilder()
			        .setConnectTimeout(Duration.ofMillis(connTimeout))
			        .setReadTimeout(Duration.ofMillis(connTimeout))
			        .build();
	}
}
