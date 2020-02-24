package com.skybrian.leadermailbox.dao;

import com.skybrian.leadermailbox.domain.entity.Employee;

/**
 * @Author jovi
 */ //@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    Employee getEmpById(Integer id);

    void insertEmp(Employee employee);
}
