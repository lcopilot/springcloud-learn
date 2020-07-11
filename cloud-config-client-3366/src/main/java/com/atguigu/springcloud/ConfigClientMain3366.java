package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/11
 * @time: 19:21
 * @description:
 */

@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3366 {
	public static void main(String[] args) {
		SpringApplication.run( ConfigClientMain3366.class,args);
	}
}

