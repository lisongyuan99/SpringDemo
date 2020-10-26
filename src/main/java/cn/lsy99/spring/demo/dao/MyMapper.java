package cn.lsy99.spring.demo.dao;

import cn.lsy99.spring.demo.entity.dto.StudentCourseName;
import cn.lsy99.spring.demo.entity.table.Student;
import cn.lsy99.spring.demo.entity.table.StudentCourse;
import cn.lsy99.spring.demo.entity.table.TestTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MyMapper {
    Student selectOne(@Param("id") int id);
    List<Student> selectMany();
    List<StudentCourseName> complexSelect();
    List<StudentCourseName> complexSelect2();
    int add(TestTable testTable);
    int addReturnId(TestTable testTable);
    int update(@Param("old")String old,@Param("note") String note);
    int delete(@Param("info") String info);
}
