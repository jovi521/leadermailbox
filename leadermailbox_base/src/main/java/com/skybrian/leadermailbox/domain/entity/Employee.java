package com.skybrian.leadermailbox.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author jovi
 */
@Data
public class Employee implements Serializable {

    private Integer id;

    private String lastName;

    private Integer gender;

    private String email;

    private Integer dId;
}
