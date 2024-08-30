package com.admin.novelnestadmin.services;


import com.admin.novelnestadmin.repositories.ChapterRepository;
import com.admin.novelnestadmin.repositories.NovelRepositories;
import com.entity.novelnestentity.Chapter;
import com.entity.novelnestentity.Novel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ChapterService {

    @Autowired
    private ChapterRepository chapterRepository;

    @Autowired
    private NovelRepositories novelRepositories;

    public ResponseEntity<String> delete(Long chapterId){
        chapterRepository.deleteById(chapterId);
        if (!chapterRepository.existsById(chapterId)){
            return new ResponseEntity<>("Invalid Chapter Id" , HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>("Deleted." , HttpStatus.OK);
    }

    public Chapter addChapter(Long novelId , Chapter chapter){
        Novel novel = novelRepositories.findById(novelId).orElseThrow(() -> new IllegalArgumentException("Invalid Novel ID"));

        chapter.setNovel(novel);
        return chapterRepository.save(chapter);
    }

    public ResponseEntity<String> update(Long chapterId , Chapter chapter){
        if(!chapterRepository.existsById(chapterId)){
            return new ResponseEntity<>("Invalid Chapter Id" , HttpStatus.NOT_FOUND);
        }
        chapter.setId(chapterId);
        chapterRepository.save(chapter);
        return new ResponseEntity<>("Updated." , HttpStatus.OK);
    }
}
