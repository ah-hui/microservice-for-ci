package ind.lgh.consumeruser.service;

import ind.lgh.pojos.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 因使用了Eureka，@FeignClient注解将会把name解析成注册的服务
 * 还可以使用指定完整的url或ribbon服务列表
 * 添加了断路器回退实现
 */
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {

    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id);
}
