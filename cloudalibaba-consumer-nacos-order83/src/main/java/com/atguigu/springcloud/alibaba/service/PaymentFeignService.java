package com.atguigu.springcloud.alibaba.service;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/9
 * @time: 15:37
 * @description:
 */
@Component
@FeignClient(value = "nacos-payment-provider")
public interface PaymentFeignService {

	@GetMapping(value = "/payment/nacos/{id}")
	public String getPaymentById(@PathVariable("id") Long id);

}
