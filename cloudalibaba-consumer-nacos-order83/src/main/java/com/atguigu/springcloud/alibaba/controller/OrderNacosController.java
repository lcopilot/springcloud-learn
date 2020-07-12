package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.service.PaymentFeignService;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/12
 * @time: 17:46
 * @description:
 */
@RestController
@Slf4j
public class OrderNacosController {

	@Resource
	PaymentFeignService paymentFeignService;

	@GetMapping(value = "/consumer/payment/nacos/{id}")
	public String paymentInfo(@PathVariable("id") Long id) {
		return paymentFeignService.getPaymentById(id);
	}
}
