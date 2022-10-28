package com.mmdc.microservices.msfoodservice.controller;

import com.mmdc.microservices.msfoodservice.bean.FoodMacros;
import com.mmdc.microservices.msfoodservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/foodDetails")
    public FoodMacros retrieveFoodDetails() {
        System.out.println(configuration.getProp1()+" : "+configuration.getProp2());
        return new FoodMacros(configuration.getProp1(),configuration.getProp1(),
               configuration.getProp2(), configuration.getProp2(),configuration.getProp2(),configuration.getProp2());
    }
}
