package alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/13
 * @time: 12:25
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9004
{
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain9004.class, args);
	}
}

