package com.atguigu.springcloud.lb;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/9
 * @time: 14:30
 * @description:
 */
@Component
public class MyLB implements LoadBalancer {

	private AtomicInteger atomicInteger = new AtomicInteger(0);

	public final int getAndIncrement() {
		int current;
		int next;
		for (; ; ) {
			current = this.atomicInteger.get();
			next = current >= 2147483647 ? 0 : current + 1; // 2147483647 Integer 最大值
			if (this.atomicInteger.compareAndSet(current, next)) {
				System.out.println("***第"+next+"次访问***");
				return next;
			}
		}
	}
	//* 负载均衡算法：rest接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标  ，每次服务重启动后rest接口计数从1开始。
	@Override
	public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
		int index = getAndIncrement() % serviceInstances.size();
		return serviceInstances.get(index);
	}
}
