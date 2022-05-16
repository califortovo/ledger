package com.atlant.ledger.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {

    @Value("${app.name}")
    private String appName;

//    @GetMapping(value = {"/", "home"})
//    public String getHome() {
//        return "home";
//    }

    @ModelAttribute("appName")
    public String getAppName() {
        return appName;
    }

}
