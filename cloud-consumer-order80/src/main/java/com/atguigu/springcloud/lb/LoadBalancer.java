package com.atguigu.springcloud.lb;

import java.util.List;
import org.springframework.cloud.client.ServiceInstance;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/9
 * @time: 14:28
 * @description:
 */
public interface LoadBalancer {

	ServiceInstance instance(List<ServiceInstance> serviceInstances);

}
