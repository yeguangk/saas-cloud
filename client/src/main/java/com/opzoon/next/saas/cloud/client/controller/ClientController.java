package com.opzoon.next.saas.cloud.client.controller;

import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @Value("config.place")
    private String configPlace;

    @Value("env")
    private String env;

    @GetMapping("/health")
    public String health(){
        return "health";
    }

    @RequestMapping("test/config")
    public String testConfig(){
        JsonObject data = new JsonObject();
        data.addProperty("configPlace", configPlace);
        data.addProperty("env", env);

        return data.toString();
    }
}
