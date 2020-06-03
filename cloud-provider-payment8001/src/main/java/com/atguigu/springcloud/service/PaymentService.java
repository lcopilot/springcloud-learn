package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/2
 * @time: 21:40
 * @description:
 */
public interface PaymentService {

	public int create(Payment payment);

	public Payment getPaymentById(@Param("id") Long id);
}
