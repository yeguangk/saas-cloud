package com.opzoon.next.saas.cloud.client.rest.fallback.factory;

import com.google.common.collect.Lists;
import com.opzoon.next.saas.cloud.client.rest.ConsulServiceRestClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * ConsulFallbackFactory
 *
 * @author yeguangkun on 2018/4/7 下午10:46
 * @version 1.0
 */
public class ConsulFallbackFactory implements FallbackFactory<ConsulServiceRestClient> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsulFallbackFactory.class);


    @Override
    public ConsulServiceRestClient create(Throwable throwable) {
       LOGGER.error("Fallback Consul Service Throwable", throwable);

       return () -> Lists.newArrayList("user factory");
    }
}
