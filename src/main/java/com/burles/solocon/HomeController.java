package com.burles.solocon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String displayHome(Model model) {
        model.addAttribute("name", "Will");
        return "home";
    }
}
