package com.haitaos.microservices.limitsservice.controller;

import com.haitaos.microservices.limitsservice.bean.Limits;
import com.haitaos.microservices.limitsservice.configuration.LimitsConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    private LimitsConfiguration limitsConfiguration;

    public LimitsController(LimitsConfiguration limitsConfiguration) {
        this.limitsConfiguration = limitsConfiguration;
    }
    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(limitsConfiguration.getMinimum(),
                limitsConfiguration.getMaximum());
       // return new Limits(1, 1000);
    }

}
