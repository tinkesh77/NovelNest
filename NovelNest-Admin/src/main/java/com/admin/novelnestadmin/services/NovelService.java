package com.admin.novelnestadmin.services;


import com.admin.novelnestadmin.repositories.NovelRepositories;
import com.entity.novelnestentity.AlternativeName;
import com.entity.novelnestentity.Author;
import com.entity.novelnestentity.Genre;
import com.entity.novelnestentity.Novel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class NovelService {

    @Autowired
    private NovelRepositories novelRepositories;
    public ResponseEntity<String> delete(Long novelId){
        if (!novelRepositories.existsById(novelId)){
            return new ResponseEntity<>("Invalid Id" , HttpStatus.NOT_FOUND);
        }
        novelRepositories.deleteById(novelId);
        return new ResponseEntity<>("Deleted" , HttpStatus.OK);
    }

    public ResponseEntity<String> update(Long novelId , Novel novel){

        Novel novelEx = novelRepositories.findById(novelId).orElse(null);

        if (novelEx == null){
            return new ResponseEntity<>("Invalid Id" , HttpStatus.NOT_FOUND);
        }

        if (novel.getNovelTitle() != null) {novelEx.setNovelTitle(novel.getNovelTitle());}
        if (novel.getNovelStatus() != null) novelEx.setNovelStatus(novel.getNovelStatus());
        if (novel.getDescription() != null) novelEx.setDescription(novel.getDescription());
        if (novel.getCoverImage() != null) novelEx.setCoverImage(novel.getCoverImage());
        if (novel.getPublisher() != null) novelEx.setPublisher(novel.getPublisher());

        Set<Author> currentAuthors = novelEx.getAuthors();
        Set<AlternativeName> alternativaNames = novelEx.getAlternativeNames();
        Set<Genre> genres = novelEx.getGenres();
        if (novel.getAuthors() != null) {
            currentAuthors.addAll(novel.getAuthors());
        }

        if (novel.getAlternativeNames() != null){
            alternativaNames.addAll(novel.getAlternativeNames());
        }

        if (novel.getGenres() != null){
            genres.addAll(novelEx.getGenres());
        }


        novelRepositories.save(novelEx);
        return new ResponseEntity<>("Updated" , HttpStatus.OK);
    }

    public String add(Novel novel) {
        if (novel.getAuthors() == null) {
            novel.setAuthors(new HashSet<>());
        }
        if (novel.getGenres() == null) {
            novel.setGenres(new HashSet<>());
        }
        if (novel.getAlternativeNames() == null) {
            novel.setAlternativeNames(new HashSet<>());
        }
        for (Author author : novel.getAuthors()) {
            author.setNovel(novel);
        }
        for (Genre genre : novel.getGenres()) {
            genre.setNovel(novel);
        }
        for (AlternativeName altName : novel.getAlternativeNames()) {
            altName.setNovel(novel);
        }
        novelRepositories.save(novel);
        return "Success!";
    }

}
