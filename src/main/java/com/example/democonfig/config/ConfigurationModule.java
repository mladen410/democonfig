package com.example.democonfig.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigurationModule {

    @Bean
    public YAMLConfig getYAMLConfig(){
        return new YAMLConfig();
    }

    @Bean
    public YAMLAudioConfig getYamlAudioConfig(){
        return new YAMLAudioConfig();
    }
}
