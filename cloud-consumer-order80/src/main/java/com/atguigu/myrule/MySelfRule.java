package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/5
 * @time: 10:14
 * @description:
 */
@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule(){
		return new RandomRule(); //定义随机
	}

}
