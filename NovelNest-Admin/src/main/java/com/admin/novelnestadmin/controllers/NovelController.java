package com.admin.novelnestadmin.controllers;


import com.admin.novelnestadmin.entity.Novel;
import com.admin.novelnestadmin.services.NovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/novel")
public class NovelController {

    @Autowired
    private NovelService novelService;

    @PostMapping("/add")
    public String createNovel(@RequestBody  Novel novel){
        return novelService.add(novel);
    }

    @PutMapping("/update/{novelId}")
    public String updateNovel(@PathVariable Long novelId , @RequestBody Novel novel){
        return novelService.update(novelId , novel);
    }

    @DeleteMapping("/delete/{novelId}")
    public String deleteNovel(@PathVariable Long noveId){
        return novelService.delete(noveId);
    }
}
