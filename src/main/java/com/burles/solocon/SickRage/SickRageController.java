package com.burles.solocon.SickRage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class SickRageController {

    @RequestMapping("/sickrage/addshow")
    public String addNewShow(Model model, @RequestParam("tvdbid") String tvdbid ){
        int id = Integer.parseInt(tvdbid);
        SickrageAPI api = new SickrageAPI("sickrage","http://192.168.0.11",8081,"9e0ee36c9866b4b42ccc28ca15a3dcc3");
        boolean success = false;
        try {
            success = api.addTVShow(id);
        } catch (IOException e) {
            e.printStackTrace();
        }
            model.addAttribute("name",success);

        return "/sickrage/addshow";
    }


}
