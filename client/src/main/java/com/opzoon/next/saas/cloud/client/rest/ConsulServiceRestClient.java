package com.opzoon.next.saas.cloud.client.rest;


import com.opzoon.next.saas.cloud.client.rest.fallback.ConsulHystrixClientFallback;
import com.opzoon.next.saas.cloud.client.rest.fallback.factory.ConsulFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * ConsulServiceRestClient
 *
 * @author yeguangkun on 2018/4/7 下午5:05
 * @version 1.0
 */
@FeignClient(value = "opnextservice", fallback = ConsulHystrixClientFallback.class,
        fallbackFactory = ConsulFallbackFactory.class)
public interface ConsulServiceRestClient {

    @GetMapping("service/users")
    List<String> users();
}
