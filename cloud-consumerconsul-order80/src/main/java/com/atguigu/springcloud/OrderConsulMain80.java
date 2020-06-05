package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/5
 * @time: 9:02
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {

	public static void main(String[] args) {
		SpringApplication.run(OrderConsulMain80.class, args);
	}
}
