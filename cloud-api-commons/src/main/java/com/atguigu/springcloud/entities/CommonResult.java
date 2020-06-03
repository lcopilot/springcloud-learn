package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/2
 * @time: 21:07
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

	private Integer code;
	private String message;
	private T data;

	public CommonResult(Integer code, String message) {
		this(code,message,null);
	}
}
