package com.yuanmf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther zzyy
 * @create 2020-02-21 18:07
 * 手动刷新单个 需要执行 curl -X POST "http://localhost:3355/actuator/refresh"
 * 手动刷新所有 需要执行 curl -X POST "http://localhost:3344/actuator/bus-refresh"
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3366 {
    public static void main(String[] args) {
            SpringApplication.run(ConfigClientMain3366.class, args);
    }
}
