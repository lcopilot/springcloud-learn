package com.atguigu.springcloud.controller;

import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/4
 * @time: 16:30
 * @description:
 */
@RestController
@Slf4j
public class OrderZKController {

	public static final String INVOKE_URL = "http://cloud-provider-payment";

	@Resource
	private RestTemplate restTemplate;

	@GetMapping(value = "/consumer/payment/zk")
	public String paymentInfo() {
		String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
		return result;
	}

}
