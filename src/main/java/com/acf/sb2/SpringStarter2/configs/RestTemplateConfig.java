package com.acf.sb2.SpringStarter2.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	@Value( "${rest.config.connection.timeout}" )
	private int connTimeout;

	@Value( "${rest.config.read.timeout}" )
	private int readTimeout;
	 
	public ClientHttpRequestFactory getClientHttpRequestFactory() {
	    HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
	    
	    clientHttpRequestFactory.setConnectTimeout(connTimeout);
	    clientHttpRequestFactory.setReadTimeout(readTimeout);
	    
	    return clientHttpRequestFactory;
	}
}
