package com.AdnanGondal.recipes.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        System.out.println("Hello World I how long will this take");
        return "index";
    }
}