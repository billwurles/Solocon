package com.burles.solocon.Config;

public class SickrageConfig extends AbstractConfig {

    private String apikey;

//    public SickrageConfig(String name, String host, String port, String apikey) {
//        super(name, host, port);
//        this.apikey = apikey;
//    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }
}
