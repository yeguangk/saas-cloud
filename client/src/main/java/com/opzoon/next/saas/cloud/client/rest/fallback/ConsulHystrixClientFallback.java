package com.opzoon.next.saas.cloud.client.rest.fallback;

import com.google.common.collect.Lists;
import com.opzoon.next.saas.cloud.client.rest.ConsulServiceRestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * ConsulHystrixClientFallback
 *
 * @author yeguangkun on 2018/4/7 下午10:42
 * @version 1.0
 */
public class ConsulHystrixClientFallback implements ConsulServiceRestClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsulHystrixClientFallback.class);


    @Override
    public List<String> users() {
        return Lists.newArrayList("user");
    }
}
