package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import java.util.concurrent.BlockingDeque;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/13
 * @time: 12:04
 * @description:
 */
public class CustomerBlockHandler {

	public static CommonResult handlerException(BlockException exception) {
		return new CommonResult(444, "客户自定义 global handlerException--1服务不可用");
	}

	public static CommonResult handlerException2(BlockException exception) {
		return new CommonResult(444, "客户自定义 global handlerException--2服务不可用");
	}

}
