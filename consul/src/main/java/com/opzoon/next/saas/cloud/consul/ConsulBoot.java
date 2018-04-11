package com.opzoon.next.saas.cloud.consul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * ConsulBoot
 *
 * @author yeguangkun on 2018/4/5 下午6:46
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@EnableTurbine
@EnableHystrix
@EnableHystrixDashboard
public class ConsulBoot {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsulBoot.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsulBoot.class, args);
    }
}
