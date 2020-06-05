package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/5
 * @time: 8:47
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {

	public static void main(String[] args) {
		SpringApplication.run(PaymentMain8006.class, args);
	}
}
