package cn.lsy99.spring.demo.dao.generated;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StudentCourseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    public static final StudentCourse studentCourse = new StudentCourse();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source field: student_course.id")
    public static final SqlColumn<Integer> id = studentCourse.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source field: student_course.student_id")
    public static final SqlColumn<Integer> studentId = studentCourse.studentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source field: student_course.course_id")
    public static final SqlColumn<Integer> courseId = studentCourse.courseId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source field: student_course.score")
    public static final SqlColumn<Double> score = studentCourse.score;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    public static final class StudentCourse extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> studentId = column("student_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> courseId = column("course_id", JDBCType.INTEGER);

        public final SqlColumn<Double> score = column("score", JDBCType.DOUBLE);

        public StudentCourse() {
            super("student_course");
        }
    }
}