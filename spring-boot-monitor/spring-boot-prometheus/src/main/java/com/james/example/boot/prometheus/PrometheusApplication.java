package com.james.example.boot.prometheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 启动类
 *
 * @author James
 * @date 2020/5/9
 */
@SpringBootApplication
public class PrometheusApplication {
    public static void main(String[] args) {
        SpringApplication.run(PrometheusApplication.class, args);
    }
}
