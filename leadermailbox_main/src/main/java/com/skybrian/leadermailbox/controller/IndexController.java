package com.skybrian.leadermailbox.controller;

import com.skybrian.leadermailbox.domain.entity.tel.TTelGetDeal;
import com.skybrian.leadermailbox.domain.enums.tel.StateFlagEnum;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jovi
 * @Date 2020/1/14 17:24
 * @Description
 **/
@Api(value = "IndexController", tags = {"启动类"})
@RestController(value = "/index")
public class IndexController {

    /**
     * @ApiParam 不推荐使用
     * @ApiImplicitParam-->paramType header-->放在请求头。请求参数的获取：@RequestHeader(代码中接收注解)
     *     query-->用于get请求的参数拼接。请求参数的获取：@RequestParam(代码中接收注解)
     *     path（用于restful接口）-->请求参数的获取：@PathVariable(代码中接收注解)
     *     body-->放在请求体。请求参数的获取：@RequestBody(代码中接收注解)
     *     form（不常用）
     */
    @ApiOperation(value = "index1()", tags = {"IndexController主页进入方法1"}, notes = "用来获取多个参数")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "a", value = "字符串a", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "b", value = "数字b", required = false, dataType = "int", paramType = "path"),
            @ApiImplicitParam(name = "stateFlagEnum", value = "状态标记编号枚举类", dataType = "StateFlagEnum", paramType = "query")})
    @GetMapping(value = "/index1/{b}")
    public String index1(String a, @PathVariable(value = "b") int b, StateFlagEnum stateFlagEnum) {
        return "hello: " + a + b + stateFlagEnum;
    }

    @ApiOperation(value = "主页方法2", tags = {"主页进入方法2"}, notes = "暂时先这样，后期视情况再改2")
    @ApiImplicitParam(name = "a", value = "字符串a", required = true, dataType = "String")
    @GetMapping(value = "/index2")
    public String index2(String a) {
        return "hello: " + a;
    }

    @ApiOperation(value = "主页方法3", tags = {"主页进入方法3"}, notes = "暂时先这样，后期视情况再改3")
    @ApiParam(name = "telGetDeal", value = "字符串telGetDeal", required = true, type = "TelGetDeal")
    @GetMapping(value = "/index3")
    public String index3(TTelGetDeal TTelGetDeal) {
        return "hello: " + TTelGetDeal;
    }

    @ApiOperation(value = "index4(StateFlagEnum stateFlagEnum)", tags = {"主页进入方法4"}, notes = "暂时先这样，后期视情况再改4")
//    @ApiParam(name = "stateFlagEnumssssss", value = "字符串StateFlagEnum", required = true, type = "StateFlagEnum")
//    @ApiImplicitParam(name = "stateFlagEnumssssssqqqq", value = "字符串StateFlagEnum", required = true, dataType = "String")
    @GetMapping(value = "/index4")
    public String index4(StateFlagEnum stateFlagEnum) {
        System.out.println(StateFlagEnum.STATE_FLAG_SEAT_ANSWER.getCode());
        return "hello: " + stateFlagEnum;
    }
}

