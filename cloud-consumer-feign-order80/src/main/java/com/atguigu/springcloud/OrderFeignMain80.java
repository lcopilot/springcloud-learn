package com.atguigu.springcloud;

import javax.activation.MailcapCommandMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/9
 * @time: 15:35
 * @description:
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {

	public static void main(String[] args) {
		SpringApplication.run(OrderFeignMain80.class, args);
	}
}
