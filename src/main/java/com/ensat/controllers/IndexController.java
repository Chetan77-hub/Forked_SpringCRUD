package com.ensat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Homepage controller.
 */
@Controller
public class IndexController {
    IndexController(){
        return 1;
    }

    @RequestMapping("/")
    String index() {
        return "index";
    }

}
