package com.skybrian.leadermailbox.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Author jovi
 */
@Entity
@Data
public class Department implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String departmentName;
}
