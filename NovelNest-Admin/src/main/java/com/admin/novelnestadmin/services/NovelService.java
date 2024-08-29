package com.admin.novelnestadmin.services;


import com.admin.novelnestadmin.entity.*;
import com.admin.novelnestadmin.entity.sub.AlternativaName;
import com.admin.novelnestadmin.entity.sub.Author;
import com.admin.novelnestadmin.entity.sub.Genre;
import com.admin.novelnestadmin.repositories.NovelRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
        // only update the data which is provide.
        novelRepositories.save(novelEx);
        return new ResponseEntity<>("Updated" , HttpStatus.OK);
    }

    public String add(Novel novel){
        if (novel.getAuthors() != null) {
            for (Author author : novel.getAuthors()) {
                author.setNovel(novel);
            }
        }
        if (novel.getGenres() != null) {
            for (Genre genre : novel.getGenres()) {
                genre.setNovel(novel);
            }
        }
        if (novel.getAlternativaNames() != null) {
            for (AlternativaName alternativaName : novel.getAlternativaNames()) {
                alternativaName.setNovel(novel);
            }
        }

        novelRepositories.save(novel);
        return "Susses!";
    }
}
