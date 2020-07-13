package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/13
 * @time: 12:39
 * @description:
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class OrderNacosMain84 {

	public static void main(String[] args) {
		SpringApplication.run(OrderNacosMain84.class, args);
	}
}

