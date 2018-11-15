package com.burles.solocon.Utils;

import com.burles.solocon.SickRage.SearchItem;
import com.burles.solocon.SickRage.SickrageAPI;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.ArrayList;

@Controller
public class SearchController {

    @RequestMapping("/search")
    public String displaySearchResults(Model model, @RequestParam("q") String query){
        System.out.printf("SEARCH COMMENCING - %s",query);
        StringBuilder builder = new StringBuilder("<h1>Search Results</h1>");
        try {
            SickrageAPI api = new SickrageAPI("sickrage","http://192.168.0.11",8081,"9e0ee36c9866b4b42ccc28ca15a3dcc3");
            ArrayList<SearchItem> searchList = api.searchTVIndexers(query);

            for(SearchItem s : searchList){
                builder.append(s.toHTML());
                System.out.printf("<p>RESULT: %s - %s - %s - %d - %d</p>\n" +
                                "<a href=\"\" >Add this show</a>",
                        s.name, s.firstAired.toString(), s.inShowList, s.indexer, s.tvdbid);
            }

            model.addAttribute("searchResults", builder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "results";//builder.toString();
    }

}
