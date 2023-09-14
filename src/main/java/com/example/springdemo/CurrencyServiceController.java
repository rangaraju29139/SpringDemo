package com.example.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-service")
    public CurrencyServiceConfiguration retrieveAllCourses(){
        return configuration;
    }


}
