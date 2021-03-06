package com.wxz.learn.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    public static final Logger LOG = LoggerFactory.getLogger(MyService.class);
    public String test(){
        LOG.info("my service.");
        return "hello,spring boot demo.";
    }
}
