package org.jiang.myspringcloudalibabaconsumer.service;

import org.jiang.myspringcloudalibabaconsumer.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "my-springcloud-alibaba-provider", fallback = EchoServiceFallback.class,
        configuration = FeignConfiguration.class)
public interface EchoService {

    @GetMapping("/echo/{str}")
    String echo(@PathVariable("str") String str);

    @GetMapping("/divide")
    String divide(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

    default String divide(Integer a) {
        return divide(a, 0);
    }

    @GetMapping("/notFound")
    String notFound();
}
