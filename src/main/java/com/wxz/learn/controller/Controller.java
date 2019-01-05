package com.wxz.learn.controller;

import com.wxz.learn.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class Controller {

    public static final Logger LOG = LoggerFactory.getLogger(Controller.class);

    @Autowired
    MyService myService;

    @RequestMapping("/test2")
    public String test() {
        LOG.info("my controller.");
        return myService.test();
    }
}
