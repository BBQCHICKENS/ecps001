package com.lbj.ecps.controller;

import com.lbj.ecps.model.EbBrand;
import com.lbj.ecps.service.EbBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.PrintWriter;
import java.util.List;

/**
 * Created by gqq on 2018/1/15.
 */
@Controller
@RequestMapping(value = "/brand")
public class EbBrandController {

    @Autowired
    private EbBrandService ebBrandService;


    @RequestMapping(value = "/toEbBrand.do")
    public String toEbBrand(Model model){
        List<EbBrand> ebBrands = this.ebBrandService.selectAllBrands();
        model.addAttribute("ebBrands",ebBrands);
        return "item/listbrand";
    }

    //去修改页面
    @RequestMapping(value = "/toEditBrand.do")
    public String toEditBrand(){
        return "item/editbrand";
    }
    //去添加页面
    @RequestMapping(value = "/toSaveBrand.do")
    public String toSaveBrand(){
        return "item/addbrand";
    }

    //删除商品品牌
    @RequestMapping(value = "/deleteBrand.do")
    public  String deleteBrand(Long brandId){
        this.ebBrandService.deleteByPrimaryKey(brandId);
        return "redirect:toEbBrand.do";
    }

    //修改商品品牌
    @RequestMapping(value = "/updateBrand.do")
    public  String updateBrand(EbBrand ebBrand){
        this.ebBrandService.updateByPrimaryKeySelective(ebBrand);
        return "redirect:toEbBrand.do";
    }

    //添加商品品牌
    @RequestMapping(value = "/saveBrand.do")
    public  String saveBrand(EbBrand ebBrand){
        this.ebBrandService.insert(ebBrand);
        return "redirect:toEbBrand.do";
    }
    //验证商品品牌名称
    @RequestMapping(value = "/validateBlandName.do",method = RequestMethod.GET)
    public  void validateBlandName(String blandName,PrintWriter out)throws  Exception{
        blandName= new String(blandName.getBytes("ISO-8859-1"),"UTF-8");
        System.out.println(blandName);
        boolean b = this.ebBrandService.validateBrandName(blandName);
        if(b){
            out.print("yes");
        }else{
            out.print("no");
        }
    }
}
