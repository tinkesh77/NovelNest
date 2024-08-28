package com.admin.novelnestadmin.controllers;


import com.admin.novelnestadmin.entity.Chapter;
import com.admin.novelnestadmin.services.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chapters")
public class ChapterController {

    @Autowired
    private ChapterService chapterService;


    @PostMapping("/add/{novelId}")
    public String addChapter(@PathVariable Long novelId  , @RequestBody Chapter chapter){
        Chapter saveChapter = chapterService.addChapter(novelId , chapter);
        return "Added !";
    }

    @DeleteMapping("/delete/{chapterId}")
    public String deleteChapter(@PathVariable Long chapterId){
        return chapterService.delete(chapterId);
    }


    @PutMapping("/update/{chapterId}")
    public String updateChapter(@PathVariable Long chapterId , @RequestBody Chapter chapter){
        return chapterService.update(chapterId , chapter);
    }
}
