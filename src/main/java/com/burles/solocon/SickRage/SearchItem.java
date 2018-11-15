package com.burles.solocon.SickRage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SearchItem {

    public String name;
    public int tvdbid;
    public Date firstAired;
    public boolean inShowList;
    public int indexer;


    public SearchItem(String name, String first_aired, boolean in_show_list, int indexer, int tvdbid) {
        this.name = name;
        inShowList = in_show_list;
        this.indexer = indexer;
        this.tvdbid = tvdbid;

        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        firstAired = new Date(); //TODO proper date parse error checking -
        switch (first_aired) {
            case "Unknown": firstAired.setTime(253370678400L); //this date is 9999-01-01 - it represents unknown date
                break;
            default:
                try{
                    firstAired = dateFormat.parse(first_aired);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    public String toHTML(){
        return "<li>" +
                "<p>"+firstAired+" - "+name +"</p>" +
                "<p>"+inShowList+" - "+tvdbid +" - "+indexer+"</p>" +
                "</li>";
    }
}
