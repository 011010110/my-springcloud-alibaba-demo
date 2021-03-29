package org.jiang.myspringcloudalibabagateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MySpringcloudAlibabaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringcloudAlibabaGatewayApplication.class, args);
    }

    @RestController
    public class fallback{

        @RequestMapping("/fallback")
        public String fallback(){
            return "this is fall back";
        }
    }

}
