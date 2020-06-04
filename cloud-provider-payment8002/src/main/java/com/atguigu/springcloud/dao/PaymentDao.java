package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/2
 * @time: 21:12
 * @description:
 */
@Mapper
public interface PaymentDao {

	public int create(Payment payment);

	public Payment getPaymentById(@Param("id") Long id);
}
