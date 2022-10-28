package com.mmdc.microservices.msfoodservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("food-service")
public class Configuration {
    private String prop1;
    private float prop2;


    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public float getProp2() {
        return prop2;
    }

    public void setProp2(float prop2) {
        this.prop2 = prop2;
    }
}
