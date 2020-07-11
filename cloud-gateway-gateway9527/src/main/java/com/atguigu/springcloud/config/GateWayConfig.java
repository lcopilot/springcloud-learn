package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder.Builder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/11
 * @time: 10:41
 * @description:
 */
@Configuration
public class GateWayConfig {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
		Builder routes = routeLocatorBuilder.routes();
		routes.route("path_route_atguigu", r -> r.path("/guonei").uri("http://news.baidu.com/guonei"));
		routes.route("path_route_atguigu", r -> r.path("/guoji").uri("http://news.baidu.com/guoji"));
		return routes.build();
	}
}
