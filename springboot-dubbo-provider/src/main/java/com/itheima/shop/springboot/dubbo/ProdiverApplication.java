package com.itheima.shop.springboot.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Tom
 */
//自动装配dubbo服务
@EnableDubboConfiguration
@SpringBootApplication
public class ProdiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProdiverApplication.class,args);
    }
}
