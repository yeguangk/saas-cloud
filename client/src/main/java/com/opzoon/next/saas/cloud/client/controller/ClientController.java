package com.opzoon.next.saas.cloud.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClientController
 *
 * @author yeguangkun on 2018/4/7 下午5:07
 * @version 1.0
 */
@RestController
public class ClientController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientController.class);

    @GetMapping("/health")
    public String health(){
        return "health";
    }
}
