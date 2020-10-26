package cn.lsy99.spring.demo.dao;

import cn.lsy99.spring.demo.entity.dto.StudentCourseName;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

import java.util.List;

@Mapper
public interface MyMapperDynamic {
    @SelectProvider(type= SqlProviderAdapter.class, method="select")
    @ResultMap("StudentCourseName")
    List<StudentCourseName> selectStudentAndCourseName(SelectStatementProvider selectStatementProvider);

}
