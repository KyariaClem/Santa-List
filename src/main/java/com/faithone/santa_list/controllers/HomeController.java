package com.faithone.santa_list.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


    // Have to make methods for controller now
    //@Responsebody if returning a string on page/ do not need @ReponseBody if not returning a string(returning a template)


    // @GGetMapping for get request to display data on page ("/) -the tag
   /* @GetMapping("/")
    @ResponseBody
    public String returnWelcomePage(){
        return "welcome to santa's homepage";
    }*/

    @GetMapping("/")
    //@ResponseBody
    public String returnWelcomePageHtml(Model model){
        //Added in model interace to add use model.addAttribute. First ""- name ii gave th:text =${} , second ""- value i want template to display
        model.addAttribute("headingText", "Welcome to Santas Workshop !");
        return "welcome";
        // created getmapping method returning HTML 1. <h3> :welcome header
//        return "<h3>Welcome to Santa's Workshop</h3>" +
//                // used <p> </p> html tag for sentence "meet your elf"
//                // base tags <p> <a href = > </a> </p>
//                // wrapped the link HTNL tag <a href= /elves - route once user clicks on link> </a>
//                "<p> Meet your <a href='/elves'>elf</a> !</p>"
//                ;
    }

//    @GetMapping("/elves")
//    @ResponseBody
//    public String elvesHomepage() {
//        return "ELVES !!";
//    }
}
