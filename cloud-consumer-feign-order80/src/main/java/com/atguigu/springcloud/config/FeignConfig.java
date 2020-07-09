package com.atguigu.springcloud.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/9
 * @time: 16:16
 * @description:
 */
@Configuration
public class FeignConfig {

	@Bean
	Logger.Level feignLoggerLevel(){
		return Logger.Level.FULL;
	}
}

