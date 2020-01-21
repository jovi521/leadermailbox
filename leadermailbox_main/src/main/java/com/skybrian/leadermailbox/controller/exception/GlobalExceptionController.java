package com.skybrian.leadermailbox.controller.exception;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.skybrian.leadermailbox.domain.model.CustomErrorType;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author jovi
 * @Date 2020/1/16 15:05
 * @Description
 **/
@RestController
public class GlobalExceptionController implements ErrorController {

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) throws JsonProcessingException {
        String message;
        // 获取statusCode:401,404,500
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == HttpStatus.BAD_REQUEST.value()) {
            message = "语义有误,当前请求无法被服务器理解或请求参数有误";
        } else if (statusCode == HttpStatus.UNAUTHORIZED.value()) {
            message = "当前请求需要用户验证";
        } else if (statusCode == HttpStatus.FORBIDDEN.value()) {
            message = "权限不足";
        } else if (statusCode == HttpStatus.NOT_FOUND.value()) {
            message = "请求的资源不存在";
        } else {
            message = "系统不小心生病了,正在紧急修复中,请耐心等候...o(╥﹏╥)o";
        }
        CustomErrorType customErrorType = new CustomErrorType();
        customErrorType.setStatusValue(statusCode);
        customErrorType.setExMessager(message);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(customErrorType);
    }
}
