package cn.lsy99.spring.demo.entity.table;

import javax.annotation.Generated;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestTable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source field: test_table.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source field: test_table.info")
    private String info;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source field: test_table.note")
    private String note;
}