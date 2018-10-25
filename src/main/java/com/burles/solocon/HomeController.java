package com.burles.solocon;

import com.burles.solocon.Utils.AbstractAPIAccess;
import com.burles.solocon.Utils.SearchItem;
import com.burles.solocon.Utils.SickrageAPI;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.ArrayList;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String displayHome(Model model) {
        model.addAttribute("name", "Will");

//        System.out.println(json.toString());
//        System.out.println(json.get("data").toString());
//        System.out.println("\n\n");
//        for(JsonNode n : json.get("data").get("results")){
//            System.out.println(n.toString());
//        }


//        SickRageTemplate template = new SickRageTemplate();
//        ArrayList<SearchItem> search = new ArrayList<>(template.searchForShows("good wife"));


//        System.out.println(search);
//        for(SearchItem item : search){
//            System.out.printf("ITEM: %s - %s - %d - %s - %d",item.first_aired, item.in_show_list, item.indexer, item.name, item.tvdbid);
//        }


        return "home";
    }
}
