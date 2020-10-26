package cn.lsy99.spring.demo.dao.generated;

import static cn.lsy99.spring.demo.dao.generated.StudentCourseDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.lsy99.spring.demo.entity.table.StudentCourse;
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
public interface StudentCourseMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    BasicColumn[] selectList = BasicColumn.columnList(id, studentId, courseId, score);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<StudentCourse> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<StudentCourse> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("StudentCourseResult")
    Optional<StudentCourse> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="StudentCourseResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="student_id", property="studentId", jdbcType=JdbcType.INTEGER),
        @Result(column="course_id", property="courseId", jdbcType=JdbcType.INTEGER),
        @Result(column="score", property="score", jdbcType=JdbcType.DOUBLE)
    })
    List<StudentCourse> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, studentCourse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, studentCourse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    default int insert(StudentCourse record) {
        return MyBatis3Utils.insert(this::insert, record, studentCourse, c ->
            c.map(id).toProperty("id")
            .map(studentId).toProperty("studentId")
            .map(courseId).toProperty("courseId")
            .map(score).toProperty("score")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    default int insertMultiple(Collection<StudentCourse> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, studentCourse, c ->
            c.map(id).toProperty("id")
            .map(studentId).toProperty("studentId")
            .map(courseId).toProperty("courseId")
            .map(score).toProperty("score")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    default int insertSelective(StudentCourse record) {
        return MyBatis3Utils.insert(this::insert, record, studentCourse, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(studentId).toPropertyWhenPresent("studentId", record::getStudentId)
            .map(courseId).toPropertyWhenPresent("courseId", record::getCourseId)
            .map(score).toPropertyWhenPresent("score", record::getScore)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    default Optional<StudentCourse> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, studentCourse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    default List<StudentCourse> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, studentCourse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.8934239+08:00", comments="Source Table: student_course")
    default List<StudentCourse> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, studentCourse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: student_course")
    default Optional<StudentCourse> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: student_course")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, studentCourse, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: student_course")
    static UpdateDSL<UpdateModel> updateAllColumns(StudentCourse record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(studentId).equalTo(record::getStudentId)
                .set(courseId).equalTo(record::getCourseId)
                .set(score).equalTo(record::getScore);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: student_course")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(StudentCourse record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(studentId).equalToWhenPresent(record::getStudentId)
                .set(courseId).equalToWhenPresent(record::getCourseId)
                .set(score).equalToWhenPresent(record::getScore);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: student_course")
    default int updateByPrimaryKey(StudentCourse record) {
        return update(c ->
            c.set(studentId).equalTo(record::getStudentId)
            .set(courseId).equalTo(record::getCourseId)
            .set(score).equalTo(record::getScore)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-10-26T17:59:22.9090509+08:00", comments="Source Table: student_course")
    default int updateByPrimaryKeySelective(StudentCourse record) {
        return update(c ->
            c.set(studentId).equalToWhenPresent(record::getStudentId)
            .set(courseId).equalToWhenPresent(record::getCourseId)
            .set(score).equalToWhenPresent(record::getScore)
            .where(id, isEqualTo(record::getId))
        );
    }
}