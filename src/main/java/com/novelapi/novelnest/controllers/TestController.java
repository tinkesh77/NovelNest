package com.novelapi.novelnest.controllers;

import com.novelapi.novelnest.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    public String getTest() {
        return testService.getName();
    }
}

//i am adarsh bro
// i am tinkesh bhoyar
// i am adarsh bro 2