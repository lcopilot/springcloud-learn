package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/12
 * @time: 18:13
 * @description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377 {

	public static void main(String[] args) {
		SpringApplication.run(NacosConfigClientMain3377.class, args);
	}
}

