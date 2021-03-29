package org.jiang.myspringcloudalibabaprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RefreshScope
public class EchoController {

    @Value("${developername}")
    private String name;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/")
    public ResponseEntity index() {
        Map<String, Object> content = new HashMap<>(16);
        content.put("test","ResponseEntity");
        return ResponseEntity.ok()
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .header(HttpHeaders.ALLOW,"*")
                .body(content);
    }

    @GetMapping("/test")
    public ResponseEntity test() {
        return ResponseEntity.badRequest()
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .header(HttpHeaders.ALLOW,"*")
                .body("this path not content");
    }

    @GetMapping("/sleep")
    public String sleep() {
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "ok";
    }

    @GetMapping("/echo/{string}")
    public String echo(@PathVariable String string) {
        return "serverPort:"+serverPort+",hello Nacos Discovery "+name+":" + string;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer a, @RequestParam Integer b) {
        return String.valueOf(a / b);
    }

}
