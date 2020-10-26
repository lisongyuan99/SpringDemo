package cn.lsy99.spring.demo.dao;

import cn.lsy99.spring.demo.entity.table.TestTable;
import cn.lsy99.spring.demo.service.Tools;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MybatisTest {
    @Autowired
    MyMapper myMapper;
    @Autowired
    Tools tools;

    @Test
    public void selectOneTest() {
        log.info(myMapper.selectOne(1).toString());
    }

    @Test
    public void selectManyTest(){
        log.info(myMapper.selectMany().toString());
    }

    @Test
    public void complexSelectTest(){
        log.info(myMapper.complexSelect().toString());
    }

    @Test
    public void complexSelect2Test() {
        log.info(myMapper.complexSelect().toString());
    }

    @Test
    public void addTest(){
        TestTable testTable = TestTable.builder().info(tools.randomString(10)).build();
        log.info(String.valueOf(myMapper.add(testTable)));
    }

    @Test
    public void addReturnIdTest(){
        TestTable testTable = TestTable.builder().info(tools.randomString(10)).build();
        myMapper.addReturnId(testTable);
        log.info(String.valueOf(testTable.getId()));
    }

    @Test
    public void updateTest(){
        log.info(String.valueOf(myMapper.update("234","123")));
    }

    @Test
    public void delete(){
        log.info(String.valueOf(myMapper.delete("test")));
    }

}
