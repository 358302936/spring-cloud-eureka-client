package com.ywwl.cloud.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author yanuun
 * @Date 11:27 2018/6/14
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args){
        SpringApplication.run(ClientApplication.class,args);
    }
}
