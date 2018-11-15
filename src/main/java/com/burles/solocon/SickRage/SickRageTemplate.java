package com.burles.solocon.SickRage;

import com.burles.solocon.Utils.SearchItem;
import org.springframework.web.client.RestTemplate;

import java.util.List;


public class SickRageTemplate {
    public List<SearchItem> searchForShows(String search){
        RestTemplate template = new RestTemplate();

        SearchList response = template.getForObject(
                "http://breakingpoint.local:8081/api/9e0ee36c9866b4b42ccc28ca15a3dcc3/?cmd=sb.searchindexers&name=" + search,
                SearchList.class
        );

        return response.getSearchItems();


//        ResponseEntity<SearchItem> response = template.exchange(
//                "http://breakingpoint.local:8081/api/9e0ee36c9866b4b42ccc28ca15a3dcc3/?cmd=sb.searchindexers&name=" + search,
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<SearchItem>() {}
//        );



    }
}
