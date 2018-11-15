package com.burles.solocon.SickRage;

import java.util.ArrayList;
import java.util.List;

public class SearchList {

    private List<SearchItem> searchItems;
    private String langID;
    private String message;
    private String result;

    public SearchList() {
        searchItems = new ArrayList<>();
//        this.searchItems = searchItems;
//        this.langID = langID;
//        this.message = message;
//        this.result = result;
    }

    public List<SearchItem> getSearchItems() {
        return searchItems;
    }

    public void setSearchItems(List<SearchItem> searchItems) {
        this.searchItems = searchItems;
    }

//    public String getLangID() {
//        return langID;
//    }
//
//    public void setLangID(String langID) {
//        this.langID = langID;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public String getResult() {
//        return result;
//    }
//
//    public void setResult(String result) {
//        this.result = result;
//    }
}