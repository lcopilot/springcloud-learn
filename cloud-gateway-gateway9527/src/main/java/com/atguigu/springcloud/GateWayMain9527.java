package com.atguigu.springcloud;

import javax.activation.MailcapCommandMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/11
 * @time: 9:58
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {

	public static void main(String[] args) {
		SpringApplication.run(GateWayMain9527.class, args);
	}
}
