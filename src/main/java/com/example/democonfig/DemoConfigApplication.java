package com.example.democonfig;

import com.example.democonfig.config.YAMLAudioConfig;
import com.example.democonfig.config.YAMLConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoConfigApplication implements CommandLineRunner {

    @Autowired
    private YAMLConfig myConfig;

    @Autowired
    private YAMLAudioConfig yamlAudioConfig;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoConfigApplication.class);
        app.run();
    }

    public void run(String... args) throws Exception {
        System.out.println("using environment: " + myConfig.getEnvironment());
        System.out.println("name: " + myConfig.getName());
        System.out.println("enabled:" + myConfig.isEnabled());
        System.out.println("servers: " + myConfig.getServers());

        System.out.println("enabled:" + yamlAudioConfig.getTitle());
        System.out.println("servers: " + yamlAudioConfig.getUrl());
    }
}
