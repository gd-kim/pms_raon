package com.raonse2.pms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {

        return "index";
    }

    @RequestMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("name","김심평원프로님 무야호!");
        return "hello";
    }

}
