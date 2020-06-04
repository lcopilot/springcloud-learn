package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/2
 * @time: 20:04
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {

	public static void main(String[] args) {

		SpringApplication.run(PaymentMain8002.class, args);
	}

}
