package com.skybrian.leadermailbox.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author jovi
 */
@Data
public class Department implements Serializable {

    private Integer id;

    private String departmentName;
}
