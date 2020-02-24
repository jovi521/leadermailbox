package com.skybrian.leadermailbox.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Author jovi
 */
@Entity
@Data
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String lastName;

    private Integer gender;

    private String email;

    private Integer dId;
}
