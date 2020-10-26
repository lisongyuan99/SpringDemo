package cn.lsy99.spring.demo.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ToolsTest {
    @Autowired
    Tools tools;
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void test1(){
        logger.info(tools.randomString(10));
    }
}