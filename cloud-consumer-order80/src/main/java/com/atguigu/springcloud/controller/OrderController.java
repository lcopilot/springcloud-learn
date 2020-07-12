package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.lb.LoadBalancer;
import java.net.URI;
import java.util.List;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.ServerIntrospector;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
@Slf4j
public class OrderController {

//	public static final String PAYMENT_URL = "http://localhost:8001";

	public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

	@Resource
	private RestTemplate restTemplate;

	@Resource
	private LoadBalancer loadBalancer;

	@Resource
	private DiscoveryClient discoveryClient;

	@GetMapping("/consumer/payment/create")
	public CommonResult<Payment> create(Payment payment) {
		return restTemplate
				.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
	}

	@GetMapping("/consumer/payment/get/{id}")
	public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
		return restTemplate
				.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
	}

	@GetMapping("/consumer/payment/postForEntity/create")
	public CommonResult<Payment> create2(Payment payment) {
		//返回对象为 ResponseEntity对象,包含了响应中的一些重要信息,比如响应头、响应状态码、响应体等
		ResponseEntity<CommonResult> entity = restTemplate
				.postForEntity(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
		if (entity.getStatusCode().is2xxSuccessful()) {
			log.info(entity.getStatusCode() + "\t" + entity.getHeaders());
			return entity.getBody();
		}
		return new CommonResult<>(444, "操作失败!");
	}

	@GetMapping("/consumer/payment/getForEntity/{id}")
	public CommonResult<Payment> getPayment2(@PathVariable("id") Long id) {
		//返回对象为 ResponseEntity对象,包含了响应中的一些重要信息,比如响应头、响应状态码、响应体等
		ResponseEntity<CommonResult> result = restTemplate
				.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
		if (result.getStatusCode().is2xxSuccessful()) {
			log.info(result.getStatusCode() + "\t" + result.getHeaders());
			return result.getBody();
		}
		return new CommonResult<>(444, "操作失败!");
	}

	@GetMapping(value = "/consumer/payment/lb")
	public String getPaymentLB() {
		List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
		if (instances == null || instances.size() <= 0) {
			return null;
		}
		ServiceInstance serviceInstance = loadBalancer.instance(instances);
		URI uri = serviceInstance.getUri();

		return restTemplate.getForObject(uri + "/payment/lb", String.class);
	}

	// ====================> zipkin+sleuth
	@GetMapping("/consumer/payment/zipkin")
	public String paymentZipkin() {
		String result = restTemplate.getForObject("http://localhost:8001" + "/payment/zipkin/", String.class);
		return result;
	}


}
