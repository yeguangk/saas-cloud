package com.opzoon.next.saas.cloud.consul.controller;

import com.google.common.collect.Lists;
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

    @GetMapping("users")
    public List<String> users(){
        return Lists.newArrayList("user1", "user2");
    }

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

    @PostMapping("user")
    public boolean insert(String user){
        return true;
    }

    @PutMapping("user")
    public boolean update(String user) {
        return true;
    }

    @DeleteMapping("user/{id}")
    public boolean delete(@PathVariable Integer id){
        return true;
    }
}
