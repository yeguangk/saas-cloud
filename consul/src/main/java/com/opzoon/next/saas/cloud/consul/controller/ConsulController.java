package com.opzoon.next.saas.cloud.consul.controller;

import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @Value("${consul}")
    private String consul;
    @Value("${name}")
    private String name;
    @Value("${env}")
    private String env;
    @Value("${env_data}")
    private String envData;

    @RequestMapping("test/config")
    public String config(){
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("consul", consul);
        jsonObject.addProperty("name", name);
        jsonObject.addProperty("env", env);
        jsonObject.addProperty("env_data", envData);

        return jsonObject.toString();
    }

    @GetMapping("/health")
    public String health(){
        return "health";
    }
}
