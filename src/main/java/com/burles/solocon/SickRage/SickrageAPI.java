package com.burles.solocon.SickRage;

import com.burles.solocon.SickRage.SearchItem;
import com.burles.solocon.Utils.AbstractAPIAccess;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SickrageAPI extends AbstractAPIAccess {

    private final String apikey;

    public SickrageAPI(String name, String hostname, int port, String apikey) {
        super(name, hostname, port);
        this.apikey = apikey;
    }

    public ArrayList<SearchItem> searchTVIndexers(String searchTerm) throws IOException {
        //JsonNode json = template.getForObject("http://breakingpoint.local:8081/api/9e0ee36c9866b4b42ccc28ca15a3dcc3/?cmd=sb.searchindexers&name=good wife", JsonNode.class);
        JsonNode result = super.getEndpointJSON("/api/"+apikey+"/?cmd=sb.searchindexers&name="+searchTerm);
        ArrayList<SearchItem> searchList = new ArrayList<>();
        for(JsonNode item : result.get("data").get("results")){
            searchList.add(new SearchItem(
                    item.get("name").asText(),
                    item.get("first_aired").asText(),
                    item.get("in_show_list").asBoolean(),
                    item.get("indexer").asInt(),
                    item.get("tvdbid").asInt()
            ));
        }
        return searchList;
    }

    public boolean addTVShow(int tvdbid) throws IOException {
        JsonNode result = super.getEndpointJSON("/api/"+apikey+"/?cmd=show.addnew&tvdbid="+tvdbid); //TODO: Take advantage of advanced options with this endpoint
        String success = result.get("result").asText();
        switch (success){
            case "success":
                return true;
            case "failure":
                return false;
            default:
                return false;
        }
    }
}
