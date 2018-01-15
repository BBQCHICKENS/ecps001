package com.lbj.ecps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gqq on 2018/1/15.
 */
@Controller
@RequestMapping(value = "/brand")
public class EbBrandController {




    @RequestMapping(value = "/toEbBrand.do")
    public String toEbBrand(Model model){

        return "item/listbrand";
    }


}
