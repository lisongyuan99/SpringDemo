package cn.lsy99.spring.demo.dao.generated;

import static cn.lsy99.spring.demo.dao.generated.TestTableDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.lsy99.spring.demo.entity.table.TestTable;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface TestTableMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    BasicColumn[] selectList = BasicColumn.columnList(id, info, note);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TestTable> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TestTable> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TestTableResult")
    Optional<TestTable> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TestTableResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="info", property="info", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR)
    })
    List<TestTable> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, testTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, testTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    default int insert(TestTable record) {
        return MyBatis3Utils.insert(this::insert, record, testTable, c ->
            c.map(id).toProperty("id")
            .map(info).toProperty("info")
            .map(note).toProperty("note")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    default int insertMultiple(Collection<TestTable> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, testTable, c ->
            c.map(id).toProperty("id")
            .map(info).toProperty("info")
            .map(note).toProperty("note")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    default int insertSelective(TestTable record) {
        return MyBatis3Utils.insert(this::insert, record, testTable, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(info).toPropertyWhenPresent("info", record::getInfo)
            .map(note).toPropertyWhenPresent("note", record::getNote)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    default Optional<TestTable> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, testTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    default List<TestTable> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, testTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    default List<TestTable> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, testTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    default Optional<TestTable> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, testTable, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    static UpdateDSL<UpdateModel> updateAllColumns(TestTable record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(info).equalTo(record::getInfo)
                .set(note).equalTo(record::getNote);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TestTable record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(info).equalToWhenPresent(record::getInfo)
                .set(note).equalToWhenPresent(record::getNote);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    default int updateByPrimaryKey(TestTable record) {
        return update(c ->
            c.set(info).equalTo(record::getInfo)
            .set(note).equalTo(record::getNote)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: test_table")
    default int updateByPrimaryKeySelective(TestTable record) {
        return update(c ->
            c.set(info).equalToWhenPresent(record::getInfo)
            .set(note).equalToWhenPresent(record::getNote)
            .where(id, isEqualTo(record::getId))
        );
    }
}