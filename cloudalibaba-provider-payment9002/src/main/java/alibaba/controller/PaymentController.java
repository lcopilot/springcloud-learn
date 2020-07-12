package alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springCloud
 * @auther: MuGe
 * @date: 2020/7/12
 * @time: 17:25
 * @description:
 */
@RestController
public class PaymentController
{
	@Value("${server.port}")
	private String serverPort;

	@GetMapping(value = "/payment/nacos/{id}")
	public String getPayment(@PathVariable("id") Integer id)
	{
		return "nacos registry, serverPort: "+ serverPort+"\t id"+id;
	}
}
