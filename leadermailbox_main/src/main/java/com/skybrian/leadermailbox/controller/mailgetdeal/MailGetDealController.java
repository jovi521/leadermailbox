package com.skybrian.leadermailbox.controller.mailgetdeal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jovi
 */
@Controller
@RequestMapping(value = "mailGetDeal")
public class MailGetDealController {

    @GetMapping(value = "getMailGetDeal")
    public ModelAndView getMailGetDeal() {
        ModelAndView modelAndView = new ModelAndView("index");

        return modelAndView;
    }
}
