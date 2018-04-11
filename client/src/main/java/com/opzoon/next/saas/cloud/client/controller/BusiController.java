package com.opzoon.next.saas.cloud.client.controller;

import com.google.common.collect.Lists;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * BusiController
 *
 * @author yeguangkun on 2018/4/9 下午7:17
 * @version 1.0
 */
@RestController
public class BusiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BusiController.class);

    @GetMapping("infos") @HystrixCommand(fallbackMethod = "hystrixInfos")
    public List<String> infos(){
        return Lists.newArrayList("busi1", "busi2");
    }

    @PostMapping("info") @HystrixCommand(fallbackMethod = "hystrixInsert")
    public Boolean insert(String info){
        LOGGER.info("Insert info :{}", info);
        return true;
    }

    @PutMapping("info") @HystrixCommand(fallbackMethod = "hystrixUpdate")
    public Boolean update(String info) {
        LOGGER.info("Update info :{}", info);
        return true;
    }

    @DeleteMapping("info") @HystrixCommand(fallbackMethod = "hystrixDelete")
    public Boolean delete(String info) {
        LOGGER.info("Delete info :{}", info);
        return true;
    }

    public List<String> hystrixInfos(){
        LOGGER.error("Get Infos error");
        return Lists.newArrayList();
    }

    public Boolean hystrixInsert(String info) {
        LOGGER.error("Insert info :{}", info);
        return false;
    }

    public Boolean hystrixUpdate(String info){
        LOGGER.error("Update info:{}", info);
        return false;
    }

    public Boolean hystrixDelete(String info){
        LOGGER.error("Delete info:{}", info);
        return false;
    }
}
