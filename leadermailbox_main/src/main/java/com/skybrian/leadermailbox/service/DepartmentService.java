package com.skybrian.leadermailbox.service;

import com.skybrian.leadermailbox.dao.DepartmentMapper;
import com.skybrian.leadermailbox.domain.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    public Department getDeptById(Integer id){
        return departmentMapper.getDeptById(id);
    }

}
