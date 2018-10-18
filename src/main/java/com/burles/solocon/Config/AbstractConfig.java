package com.burles.solocon.Config;

public abstract class AbstractConfig {

    private String name;
    private String hostname;
    private String port;

//    public AbstractConfig(String name, String host, String port) {
//        this.name = name;
//        this.hostname = host;
//        this.port = port;
//    }

    public String getName() {
        return name;
    }

    public String getHostname() {
        return hostname;
    }

    public String getPort() {
        return port;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
