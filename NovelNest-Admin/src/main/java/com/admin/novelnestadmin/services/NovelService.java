package com.admin.novelnestadmin.services;


import com.admin.novelnestadmin.entity.Novel;
import com.admin.novelnestadmin.repositories.NovelRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NovelService {

    @Autowired
    private NovelRepositories novelRepositories;

    public String add(Novel novel){
        return validation(novel);
    }

    public String validation(Novel novel){
        if (novel.getNovelTitle() ==null){
            return "Title is empty";
        }
        if ( novel.getNovelAuthor() == null){
            return "Author is empty";
        }
        if (novel.getNovelGenra() == null){
            return "Genra is empty";
        }
        if (novel.getDecrption() == null ){
            return "Description is empty";
        }
        if (novel.getNovelStatus() == null){
            return "Statuus is empty";
        }
        if (novel.getAlternativaName() == null){
            return "Alternative name is empty";
        }
        if (novel.getCoverImage() == null){
            return "image is empty";
        }
        if (novel.getPublisher() == null){
            return "Publisher is empty";
        }

        novelRepositories.save(novel);

        return "Susses !";
    }
}
