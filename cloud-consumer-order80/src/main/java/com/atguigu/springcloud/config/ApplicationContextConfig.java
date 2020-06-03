package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/3
 * @time: 20:23
 * @description:
 */
@Configuration
public class ApplicationContextConfig {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
