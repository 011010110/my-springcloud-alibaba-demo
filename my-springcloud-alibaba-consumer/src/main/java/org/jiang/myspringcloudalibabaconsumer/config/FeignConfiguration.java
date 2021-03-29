package org.jiang.myspringcloudalibabaconsumer.config;

import org.jiang.myspringcloudalibabaconsumer.service.EchoServiceFallback;
import org.springframework.context.annotation.Bean;

public class FeignConfiguration {

    @Bean
    public EchoServiceFallback echoServiceFallback() {
        return new EchoServiceFallback();
    }
}
