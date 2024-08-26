package com.novelapi.novelnest.controllers;

import com.novelapi.novelnest.entity.NovelMetaData;
import com.novelapi.novelnest.services.NovelMetaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class NovelMetaDataController {

    @Autowired
    private final NovelMetaDataService novelMetaDataService;

    public NovelMetaDataController(NovelMetaDataService novelMetaDataService) {
        this.novelMetaDataService = novelMetaDataService;
    }

    @GetMapping("/getNovelMetaData")
    public List<NovelMetaData> getMetaData() {
        return novelMetaDataService.getNovelData();
    }
}
