package com.skybrian.leadermailbox.controller;

import com.skybrian.leadermailbox.domain.entity.TelGetDeal;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jovi
 * @Date 2020/1/14 17:24
 * @Description
 **/
@Api(tags = {"启动类", "主页类"})
@RestController(value = "/index")
public class IndexController {

    @ApiOperation(value = "主页方法1", tags = {"主页进入方法1"}, notes = "暂时先这样，后期视情况再改1")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "a", value = "字符串a", required = true, dataType = "String"),
            @ApiImplicitParam(name = "b", value = "数字b", required = false, dataType = "int")})
    @GetMapping(value = "/index1")
    public String index1(String a, int b) {
        return "hello: " + a + b;
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
    public String index3(TelGetDeal telGetDeal) {
        return "hello: " + telGetDeal;
    }
}

