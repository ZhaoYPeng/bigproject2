package com.zyp.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackAction {
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        //前提条件：请求地址和页面地址名称一致。
        return page;//返回页面地址
    }

}
