package cn.lsy99.spring.demo.aop.controller;

import cn.lsy99.spring.demo.aop.annotation.ProcessTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/hello")
    @ProcessTime
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        logger.info("Hello " + name);
        return String.format("Hello %s!", name);
    }
}
