package com.opzoon.next.saas.cloud.client.runner;

import com.opzoon.next.saas.cloud.client.rest.ConsulServiceRestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * FeignCommonRunner
 *
 * @author yeguangkun on 2018/4/7 下午5:11
 * @version 1.0
 */
@Component
public class FeignCommonRunner implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(FeignCommonRunner.class);

    @Autowired
    private ConsulServiceRestClient consulServiceRestClient;

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Get users:{}", consulServiceRestClient.users());
    }
}
