package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/2
 * @time: 21:45
 * @description:
 */
@RestController
@Slf4j
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	@Value("${server.port}")
	private String serverPort;

	@PostMapping(value = "/payment/create")
	public CommonResult creat(@RequestBody Payment payment) {
		int result = paymentService.create(payment);
		log.info("*******插入结果:" + result);
		if (result > 0) {
			return new CommonResult(200, "插入数据库成功,serverPort" + serverPort, result);
		}
		return new CommonResult(444, "插入数据库成功", null);
	}

	@GetMapping(value = "/payment/get/{id}")
	public CommonResult getPaymentById(@PathVariable("id") Long id) {
		Payment payment = paymentService.getPaymentById(id);
		log.info("*******查询结果:" + payment);
		if (payment != null) {
			return new CommonResult(200, "查询成功,serverPort" + serverPort, payment);
		}
		return new CommonResult(444, "没有对应记录,查询ID:" + id, null);
	}

	@GetMapping(value = "/payment/lb")
	public String getPaymentLB() {
		return serverPort;
	}

	@GetMapping(value = "/payment/feign/timeout")
	public String paymentFeignTimeout() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return serverPort;
	}
}
