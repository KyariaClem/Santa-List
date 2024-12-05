package com.faithone.santa_list.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("santa")
public class SantaController {

    @GetMapping("/letter")
    public String sataLetterForm(){
        return "santa/letter";
    }

}