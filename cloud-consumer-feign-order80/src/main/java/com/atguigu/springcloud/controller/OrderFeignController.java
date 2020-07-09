package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentFeignService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/9
 * @time: 15:44
 * @description:
 */
@RestController
@Slf4j
public class OrderFeignController {

	@Resource
	private PaymentFeignService paymentFeignService;


	@GetMapping(value = "/consumer/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
		return paymentFeignService.getPaymentById(id);
	}

	@GetMapping(value = "/consumer/payment/feign/timeout")
	public String paymentFeignTimeout(){
		// openfeign-ribbon,客户端一般默认等待一秒钟
		return paymentFeignService.paymentFeignTimeout();
	}
}
