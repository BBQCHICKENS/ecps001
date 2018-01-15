package com.lbj.ecps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gqq on 2018/1/15.
 */
@Controller
@RequestMapping(value = "/item")
public class EbItemController {

    @RequestMapping(value = "/toEbItem.do")
    public String toEbItem(){
        return "item/index";
    }
}
