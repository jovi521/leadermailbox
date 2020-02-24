package com.skybrian.leadermailbox.dao;

import com.skybrian.leadermailbox.domain.entity.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


/**
 * @Author jovi
 */ //指定这是一个操作数据库的mapper
//@Mapper
@Repository
public interface DepartmentMapper {

    @Select(value = "SELECT * FROM department WHERE id = #{id}")
    Department getDeptById(Integer id);

    @Delete(value = "DELETE FROM department WHERE id=#{id}")
    int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert(value = "INSERT INTO department(department_name) VALUES(#{departmentName})")
    int insertDept(Department department);

    @Update(value = "UPDATE department SET department_name=#{departmentName} WHERE id=#{id}")
    int updateDept(Department department);
}
