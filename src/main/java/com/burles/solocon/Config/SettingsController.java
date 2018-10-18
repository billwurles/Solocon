package com.burles.solocon.Config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SettingsController {

    @GetMapping("/settings")
    public String settingsForm(Model model){
        model.addAttribute("sickrage", new SickrageConfig());
        return "settings";
    }

    @PostMapping("/settings")
    public String settingsSubmit(@ModelAttribute SickrageConfig sickrage){
        System.out.println("\n\n\n");
        System.out.println(sickrage.getApikey());
        System.out.println("\n\n\n");
        System.out.println(sickrage.getHostname());
        System.out.println("\n\n\n");
        System.out.println(sickrage.getPort());
        System.out.println("\n\n\n");
        System.out.println(sickrage.getName());
        System.out.println("\n\n\n");
        return "settings";
    }
}
