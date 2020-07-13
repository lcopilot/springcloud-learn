package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/13
 * @time: 15:59
 * @description:
 */
@Component
public class PaymentFallbackService implements PaymentService {

	@Override
	public CommonResult<Payment> paymentSQL(Long id) {
		return new CommonResult<>(4444,"服务降级返回,");
	}
}
