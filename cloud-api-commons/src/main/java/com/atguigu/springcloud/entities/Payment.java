package com.atguigu.springcloud.entities;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/6/2
 * @time: 21:04
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

	private Long id;
	private String serial;

}
