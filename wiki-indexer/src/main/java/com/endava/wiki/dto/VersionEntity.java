package com.endava.wiki.dto;

/**
 * Created by esamedin on 9/13/2016.
 */
public class VersionEntity {

    String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public VersionEntity(String version) {

        this.version = version;
    }
}
