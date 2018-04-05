package com.opzoon.next.saas.cloud.consul.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ConsulController
 *
 * @author yeguangkun on 2018/4/5 下午6:57
 * @version 1.0
 */
@RestController
public class ConsulController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsulController.class);


    @GetMapping("/health")
    public String health(){
        return "health";
    }
}
