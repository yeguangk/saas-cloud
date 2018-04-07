package com.opzoon.next.saas.cloud.client.rest;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * ConsulServiceRestClient
 *
 * @author yeguangkun on 2018/4/7 下午5:05
 * @version 1.0
 */
@FeignClient("opzoon-saas-consul-service")
public interface ConsulServiceRestClient {

    @GetMapping("service/users")
    List<String> users();
}
