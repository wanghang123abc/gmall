package com.atguigu.gmall.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gmall.pms.mapper")
@EnableSwagger2
@EnableDiscoveryClient
public class GmallPmsApplication {

    public static void main(String[] args) {
        System.out.println();
        SpringApplication.run(GmallPmsApplication.class, args);
    }

}
