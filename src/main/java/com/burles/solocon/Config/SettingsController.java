package com.burles.solocon.Config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DefaultPropertiesPersister;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.*;
import java.util.Properties;

@Controller
public class SettingsController {

    @GetMapping("/settings")
    public String settingsForm(Model model){
        try {
            File f = new File("config-properties.properties");
            InputStream in = new FileInputStream(f);

            Properties prop = new Properties();
            DefaultPropertiesPersister p = new DefaultPropertiesPersister();
            p.load(prop, in);

            String nickname = prop.getProperty("name");
            String hostname = prop.getProperty("hostname");
            String port = prop.getProperty("port");
            String apikey = prop.getProperty("apikey");

            model.addAttribute("sickrage", new SickrageConfig());
            model.addAttribute("nickname", nickname);
            model.addAttribute("hostname", hostname);
            model.addAttribute("port", port);
            model.addAttribute("apikey", apikey);

            System.out.printf("\n\n\n %s - %s:%s - %s \n\n\n", nickname,hostname,port,apikey);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "settings";
    }

    @PostMapping("/settings")
    public String settingsSubmit(@ModelAttribute SickrageConfig sickrage){
        try {
            Properties prop = new Properties();
            prop.setProperty("name",sickrage.getName());
            prop.setProperty("hostname",sickrage.getHostname());
            prop.setProperty("port",sickrage.getPort());
            prop.setProperty("apikey",sickrage.getApikey());

            File f = new File("config-properties.properties");
            OutputStream out = new FileOutputStream(f);

            DefaultPropertiesPersister p = new DefaultPropertiesPersister();
            p.store(prop, out, "SickrageProperties");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "home";
    }
}