package com.opzoon.next.saas.cloud.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * ClientBoo
 *
 * @author yeguangkun on 2018/4/7 下午4:42
 * @version 1.0
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableAutoConfiguration
public class ClientBoot {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientBoot.class);

    public static void main(String[] args) {
        SpringApplication.run(ClientBoot.class, args);
    }
}
