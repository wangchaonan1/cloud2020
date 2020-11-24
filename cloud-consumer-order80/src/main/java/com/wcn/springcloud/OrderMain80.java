package com.wcn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author wangchaonan
 * @Date 2020-11-24 15:48
 * @Version 1.0
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
