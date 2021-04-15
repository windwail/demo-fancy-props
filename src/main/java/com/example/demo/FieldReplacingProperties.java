package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

@ConfigurationProperties(prefix = "file.stream")
public class FieldReplacingProperties {
    private final Map<String, FieldReplacingInfo> map = new HashMap<>();

    public Map<String, FieldReplacingInfo> getMap() {
        return this.map;
    }

}
