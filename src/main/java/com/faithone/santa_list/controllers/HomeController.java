package com.faithone.santa_list.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


    // Have to make methods for controller now
    //@Responsebody if returnign a string on page/ do not need @Reponsebody if not returning a string(returning a template)


    // @GGetMapping for get request to display data on page ("/) -the tag
    @GetMapping("/")
    @ResponseBody
    public String returnWelcomePage(){
        return "welcome to santa's homepage";
    }

}
