package com.admin.novelnestadmin.controllers;


import com.admin.novelnestadmin.entity.Novel;
import com.admin.novelnestadmin.services.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/novel")
public class NovelController {

    @Autowired
    private NovelService novelService;

    @PostMapping("/add")
    public String createNovel(@RequestBody  Novel novel){
        return novelService.add(novel);
    }
}
