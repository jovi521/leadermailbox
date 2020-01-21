package com.skybrian.leadermailbox.domain.model;

import lombok.Data;

/**
 * @Author jovi
 * @Date 2020/1/17 14:28
 * @Description
 **/
@Data
public class CustomErrorType {

    private int statusValue;

    private String exMessager;

    public CustomErrorType() {
    }

    public CustomErrorType(int statusValue, String exMessager) {
        this.statusValue = statusValue;
        this.exMessager = exMessager;
    }

}
