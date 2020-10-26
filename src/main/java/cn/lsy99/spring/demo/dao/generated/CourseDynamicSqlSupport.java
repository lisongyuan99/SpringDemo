package cn.lsy99.spring.demo.dao.generated;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CourseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: course")
    public static final Course course = new Course();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source field: course.id")
    public static final SqlColumn<Integer> id = course.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source field: course.name")
    public static final SqlColumn<String> name = course.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: course")
    public static final class Course extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public Course() {
            super("course");
        }
    }
}