package ind.lgh.provideruser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author lgh
 */
@SpringBootApplication
// @EnableDiscoveryClient 提供多种服务发现组件支持，只用Eureka就用@EnableEurekaClient
@EnableEurekaClient
public class ProviderUserApplication {

    @Bean("objectMapper")
    public ObjectMapper myMapper() {
        return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class, args);
    }
}
