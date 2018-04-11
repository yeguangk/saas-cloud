package com.opzoon.next.saas.cloud.consul.controller;

import com.google.common.collect.Lists;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ServiceController
 *
 * @author yeguangkun on 2018/4/7 下午4:43
 * @version 1.0
 */
@RestController
@RequestMapping("service")
public class ServiceController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceController.class);

    @HystrixCommand(fallbackMethod = "hystrixUsers")
    @GetMapping("users")
    public List<String> users(){
        return Lists.newArrayList("user1", "user2");
    }

    @HystrixCommand(fallbackMethod = "hystrixFindUserByID")
    @GetMapping("user/{id}")
    public String users(@PathVariable Integer id){
        if (Integer.valueOf(1).equals(id)) {
            return "user1";
        }else if (Integer.valueOf(2).equals(id)){
            return "user2";
        }else {
            return "not found user";
        }
    }

    @HystrixCommand(fallbackMethod = "hystrixInsert")
    @PostMapping("user")
    public boolean insert(String user){
        return true;
    }

    @HystrixCommand(fallbackMethod = "hystrixUpdate")
    @PutMapping("user")
    public boolean update(String user) {
        return true;
    }

    @HystrixCommand(fallbackMethod = "hystrixDelete")
    @DeleteMapping("user/{id}")
    public boolean delete(@PathVariable Integer id){
        return true;
    }


    public boolean hystrixInsert(String user){
        LOGGER.error("Insert User Error, user:{}", user);
        return false;
    }

    public boolean hystrixUpdate(String user) {
        LOGGER.error("Update User Error, user:{}", user);
        return false;
    }

    public boolean hystrixDelete(String user) {
        LOGGER.error("Delete User Error, user:{}", user);
        return false;
    }

    public List<String> hystrixUsers(){
        return Lists.newArrayList();
    }

    public List<String> hystrixFindUserByID(Integer id) {
        LOGGER.error("Find User By ID  Error, id:{}", id);
        return Lists.newArrayList();
    }

}
