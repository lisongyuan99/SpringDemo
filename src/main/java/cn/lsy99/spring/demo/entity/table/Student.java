package cn.lsy99.spring.demo.entity.table;

import javax.annotation.Generated;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8778019+08:00", comments="Source field: student.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8778019+08:00", comments="Source field: student.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8778019+08:00", comments="Source field: student.gender")
    private String gender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8778019+08:00", comments="Source field: student.age")
    private Integer age;
}