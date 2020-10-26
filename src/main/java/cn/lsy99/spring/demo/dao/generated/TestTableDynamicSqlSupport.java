package cn.lsy99.spring.demo.dao.generated;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TestTableDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    public static final TestTable testTable = new TestTable();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source field: test_table.id")
    public static final SqlColumn<Integer> id = testTable.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source field: test_table.info")
    public static final SqlColumn<String> info = testTable.info;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source field: test_table.note")
    public static final SqlColumn<String> note = testTable.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    public static final class TestTable extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> info = column("info", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public TestTable() {
            super("test_table");
        }
    }
}