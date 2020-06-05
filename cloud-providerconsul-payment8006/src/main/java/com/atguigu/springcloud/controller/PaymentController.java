package com.atguigu.springcloud.controller;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/5
 * @time: 8:49
 * @description:
 */
@RestController
public class PaymentController {

	@Value("${server.port}")
	private String serverPort;

	@GetMapping(value = "/payment/consul")
	public String paymentzk() {
		return "springcloud with consul: " + serverPort + "\t" + UUID.randomUUID().toString();
	}
}
