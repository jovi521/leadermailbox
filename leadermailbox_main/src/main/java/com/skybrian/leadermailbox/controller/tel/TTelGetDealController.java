package com.skybrian.leadermailbox.controller.tel;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.skybrian.leadermailbox.domain.entity.tel.TTelGetDeal;
import com.skybrian.leadermailbox.service.tel.TTelGetDealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author jovi
 * @Date 2020/2/14 12:10
 * @Description
 **/
@Controller
@RequestMapping(value = "tel")
public class TTelGetDealController {

    @Autowired
    TTelGetDealService telGetDealService;

    @ResponseBody
    @GetMapping(value = "select")
    public IPage<TTelGetDeal> selectWithPage() {
        Integer pageNo = 0;
        Integer pageSize = 10;
        return telGetDealService.selectWithPage(pageNo, pageSize);
    }
}
