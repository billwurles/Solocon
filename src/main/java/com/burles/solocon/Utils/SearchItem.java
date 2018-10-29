package com.burles.solocon.Utils;

import java.util.Date;

public class SearchItem {
    public final Date first_aired;
    public final boolean in_show_list;
    public final int indexer;
    public final String name;
    public final int tvdbid;

    public SearchItem(String name, int tvdbid, Date first_aired, boolean in_show_list, int indexer) {
        this.first_aired = first_aired;
        this.in_show_list = in_show_list;
        this.indexer = indexer;
        this.name = name;
        this.tvdbid = tvdbid;
    }

    public String toHTML(){
        return "<li>" +
                "<p>"+first_aired+" - "+name +"</p>" +
                "<p>"+in_show_list+" - "+tvdbid +" - "+indexer+"</p>" +
                "</li>";
    }
}
