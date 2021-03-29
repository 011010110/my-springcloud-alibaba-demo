package org.jiang.myspringcloudalibabaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author lilinhua
 */
@SpringBootApplication
@EnableDiscoveryClient(autoRegister = true)
@EnableFeignClients
public class MySpringCloudAlibabaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringCloudAlibabaConsumerApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate1(){
        return new RestTemplate();
    }

}
