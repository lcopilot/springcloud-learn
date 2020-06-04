package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/4
 * @time: 8:09
 * @description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMain7002.class, args);
	}
}
