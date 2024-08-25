package com.novelapi.novelnest.controllers;

import com.novelapi.novelnest.models.SearchItems;
import com.novelapi.novelnest.services.SearchItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SearchItemController {
    @Autowired
    private SearchItemService searchItemService;

    @GetMapping("/search")
    public List<SearchItems> searchNovel(@RequestParam String query){
         return  searchItemService.searchNovel(query);
    }
}
