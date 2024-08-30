package com.admin.novelnestadmin.repositories;

import com.entity.novelnestentity.Novel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NovelRepositories extends JpaRepository<Novel, Long> {

}
