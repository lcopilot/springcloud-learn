package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMessageProvider;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/12
 * @time: 10:23
 * @description:
 */
@RestController
public class SendMessageController {

	@Resource
	private IMessageProvider messageProvider;

	@GetMapping(value = "/sendMessage")
	public String sendMessage() {
		return messageProvider.send();
	}

}
