package com.opzoon.next.saas.cloud.kisso.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * KissoController
 *
 * @author yeguangkun on 2018/4/5 下午11:32
 * @version 1.0
 */
@RestController
public class KissoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(KissoController.class);


    @GetMapping("/health")
    public String health(){
        return "health";
    }
}
