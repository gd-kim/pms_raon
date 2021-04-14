package com.raonse2.pms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("name","김심평원프로님 무야호!");
        return "hello";
    }

}
