package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/10
 * @time: 11:03
 * @description:
 */
@Component
public class PaymentFallbackService implements  PaymentHystrixService {

	@Override
	public String paymentInfo_OK(Integer id) {
		return "PaymentFallbackService fall back-paymentInfo_OK";
	}

	@Override
	public String paymentInfo_TimeOut(Integer id) {
		return "PaymentFallbackService fall back-paymentInfo_TimeOut";

	}
}
