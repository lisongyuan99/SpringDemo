package cn.lsy99.spring.demo.entity.table;

import javax.annotation.Generated;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentCourse {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source field: student_course.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source field: student_course.student_id")
    private Integer studentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source field: student_course.course_id")
    private Integer courseId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source field: student_course.score")
    private Double score;
}