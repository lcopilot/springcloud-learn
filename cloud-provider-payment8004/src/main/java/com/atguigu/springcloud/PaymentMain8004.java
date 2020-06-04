package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/4
 * @time: 13:40
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient  //用于向consul或者zookeeper作为注册中心时注册服务
public class PaymentMain8004 {

	public static void main(String[] args) {
		SpringApplication.run(PaymentMain8004.class, args);
	}
}
