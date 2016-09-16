package com.endava.wiki.dto;

/**
 * Created by mipopescu on 09-Sep-16.
 */
public class MetadataDTO {
    public int getEnvironment() {
        return environment;
    }

    private int environment;
    private String version;
    private String ip;

    public void setEnvironment(int environment) {
        this.environment = environment;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void addIP(String ip) {
        this.ip = ip;
    }

    public String getIP(){
        return ip;
    }
}
