package com.burles.solocon;

import com.burles.solocon.SickRage.SearchItem;
import com.burles.solocon.SickRage.SickRageTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String displayHome(Model model) {
        model.addAttribute("name", "Will");


        SickRageTemplate template = new SickRageTemplate();
        ArrayList<SearchItem> search = new ArrayList<>(template.searchForShows("good wife"));


        System.out.println(search);
        for(SearchItem item : search){
            System.out.printf("ITEM: %s - %s - %d - %s - %d",item.first_aired, item.in_show_list, item.indexer, item.name, item.tvdbid);
        }


        return "home";
    }
}
