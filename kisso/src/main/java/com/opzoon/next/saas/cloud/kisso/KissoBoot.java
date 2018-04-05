package com.opzoon.next.saas.cloud.kisso;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * KissoBoot
 *
 * @author yeguangkun on 2018/4/5 下午11:31
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class KissoBoot {
    private static final Logger LOGGER = LoggerFactory.getLogger(KissoBoot.class);

    public static void main(String[] args) {
        SpringApplication.run(KissoBoot.class, args);
    }
}
