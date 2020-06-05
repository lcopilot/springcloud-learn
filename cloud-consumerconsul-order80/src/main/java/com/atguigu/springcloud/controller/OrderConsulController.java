package com.atguigu.springcloud.controller;


import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/3
 * @time: 20:19
 * @description:
 */
@RestController
public class OrderConsulController {

//	public static final String PAYMENT_URL = "http://localhost:8001";
	public static final String INVOKE_URL = "http://consul-provider-payment";

	@Resource
	private RestTemplate restTemplate;

	@GetMapping(value = "/consumer/payment/consul")
	public String paymentInfo() {
		String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
		return result;
	}
}
