package com.example.democonfig.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

//@Configuration
// Das muss nicht so geschreiben werden ist aber einfacher.
// Ansonsten muss eine Bean in ConfigurationModule erzeugt werden.
@ConfigurationProperties(prefix = "audio")
public class YAMLAudioConfig {

    private String url;
    private String title;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}