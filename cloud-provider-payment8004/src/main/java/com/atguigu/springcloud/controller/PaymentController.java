package com.atguigu.springcloud.controller;

import java.util.UUID;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/4
 * @time: 13:43
 * @description:
 */
@RestController
@Slf4j
public class PaymentController {

	@Value("${server.port}")
	private String serverPort;

	@GetMapping(value = "/payment/zk")
	public String paymentzk() {
		return "springcloud with zookeeper" + serverPort + "\t" + UUID.randomUUID().toString();
	}
}
