package com.shiguangping.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页控制器
 *
 * @author liyan
 * @since 2021.1.14
 */
@Controller
public class IndexController {

    @RequestMapping({"/", "index"})
    public String index(Model model) {
        model.addAttribute("msg", "Hello Thymeleaf~");
        return "index";
    }
}
