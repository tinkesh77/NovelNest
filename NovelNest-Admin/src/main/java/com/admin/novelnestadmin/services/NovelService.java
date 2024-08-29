package com.admin.novelnestadmin.services;


import com.admin.novelnestadmin.entity.Novel;
import com.admin.novelnestadmin.repositories.NovelRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NovelService {

    @Autowired
    private NovelRepositories novelRepositories;
    private Novel novelEx;

    public String delete(Long novelId){
        if (!novelRepositories.existsById(novelId)){
            return "Invalid Id";
        }
        novelRepositories.deleteById(novelId);
        return "Deleted";
    }

    public String update(Long novelId , Novel novel){

        if (novel == null){
            return "Novel is Empty";
        }
        if (!novelRepositories.existsById(novelId)){
            return "Invalid Id";
        }
        novelEx = new Novel();
        if (novel.getNovelTitle() != null){
            novelEx.setNovelTitle(novel.getNovelTitle());
        }
        if (novel.getNovelAuthor() != null){
            novelEx.setNovelAuthor(novel.getNovelAuthor());
        }
        if (novel.getNovelGenra() != null){
            novelEx.setNovelGenra(novel.getNovelGenra());
        }
        if (novel.getNovelStatus() != null){
            novelEx.setNovelStatus(novel.getNovelStatus());
        }
        if (novel.getAlternativaName() != null){
            novelEx.setNovelStatus(novel.getAlternativaName());
        }
        if (novel.getChapters() != null){
            novelEx.setChapters(novel.getChapters());
        }
        if (novel.getDecrption() != null){
            novelEx.setDecrption(novel.getDecrption());
        }
        if (novel.getPublisher() != null){
            novelEx.setPublisher(novel.getPublisher());
        }
        // only update the data which is provide.
        novelRepositories.save(novelEx);
        return null;
    }

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
