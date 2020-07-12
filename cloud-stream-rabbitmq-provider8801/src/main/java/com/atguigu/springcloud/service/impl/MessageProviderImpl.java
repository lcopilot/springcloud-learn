package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.IMessageProvider;
import java.nio.file.OpenOption;
import java.util.UUID;
import javax.annotation.Resource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/12
 * @time: 10:11
 * @description:
 */
@EnableBinding(Source.class)  //定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider {

	@Resource
	private MessageChannel output;  //消息发送管道

	@Override
	public String send() {
		String string = UUID.randomUUID().toString();
		output.send(MessageBuilder.withPayload(string).build());
		System.out.println("******"+string);
		return null;
	}
}
