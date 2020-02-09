package com.skybrian.leadermailbox.controller;

import com.skybrian.leadermailbox.domain.entity.Department;
import com.skybrian.leadermailbox.service.DepartmentService;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

/**
 * @Author jovi
 * @Date 2020/1/14 17:24
 * @Description
 **/
@Controller
@RequestMapping(value = "demo")
public class DemoController {

    @Autowired
    private DepartmentService departmentService;

    @ResponseBody
    @GetMapping(value = "dept/{id}")
    public Department getDeptById(@PathVariable(value = "id", required = true) Integer id) {
        return departmentService.getDeptById(id);
    }

    /**
     * @description
     * @param:
     * @return: String
     * @author: jovi
     * @date: 2020/1/15 9:37
     */
    @GetMapping(value = "index")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView("index");
        LocalDateTime date = new LocalDateTime();
        modelAndView.addObject("date", date);
        modelAndView.addObject("lists", Arrays.asList("a", "b", "c"));
        return modelAndView;
    }

    /**
     * @description
     * @param:
     * @return: String
     * @author: jovi
     * @date: 2020/1/15 9:37
     */
    @GetMapping(value = "empty")
    public ModelAndView testEmpty() {
        ModelAndView modelAndView = new ModelAndView("layout/general/empty-page");
        LocalDateTime date = new LocalDateTime();
        modelAndView.addObject("date", date);
        modelAndView.addObject("lists", Arrays.asList("a", "b", "c"));
        return modelAndView;
    }
}
