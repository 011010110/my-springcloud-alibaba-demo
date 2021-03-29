package org.jiang.myspringcloudalibabaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lilinhua
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MySpringCloudAlibabaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringCloudAlibabaProviderApplication.class, args);
    }

}
