package com.example.democonfig.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

//@Configuration
// Das muss nicht so geschreiben werden ist aber einfacher.
// Ansonsten muss eine Bean in ConfigurationModule erzeugt werden.
@ConfigurationProperties(prefix = "system")
public class YAMLConfig {

    private String name;
    private String environment;
    private boolean enabled;
    private List<String> servers = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<String> getServers() {
        return servers;
    }

    public void setServers(List<String> servers) {
        this.servers = servers;
    }
}