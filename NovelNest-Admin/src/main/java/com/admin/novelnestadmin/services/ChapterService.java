package com.admin.novelnestadmin.services;


import com.admin.novelnestadmin.entity.Chapter;
import com.admin.novelnestadmin.entity.Novel;
import com.admin.novelnestadmin.repositories.ChapterRepository;
import com.admin.novelnestadmin.repositories.NovelRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChapterService {

    @Autowired
    private ChapterRepository chapterRepository;

    @Autowired
    private NovelRepositories novelRepositories;

    public String delete(Long chapterId){
        chapterRepository.deleteById(chapterId);
        if (!chapterRepository.existsById(chapterId)){
            return "Invalid Chapter Id";
        }
        return "deleted";
    }

    public Chapter addChapter(Long novelId , Chapter chapter){
        Novel novel = novelRepositories.findById(novelId).orElseThrow(() -> new IllegalArgumentException("Invalid Novel ID"));

        chapter.setNovel(novel);
        return chapterRepository.save(chapter);
    }

    public String update(Long chapterId , Chapter chapter){
        if(!chapterRepository.existsById(chapterId)){
            return "invalid Chapter Id";
        }

        chapter.setId(chapterId);
        chapterRepository.save(chapter);
        return "Updated !";
    }

}
