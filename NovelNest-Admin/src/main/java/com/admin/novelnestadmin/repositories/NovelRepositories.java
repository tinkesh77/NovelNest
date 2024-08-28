package com.admin.novelnestadmin.repositories;

import com.admin.novelnestadmin.entity.Novel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NovelRepositories extends JpaRepository<Novel, Long> {

}
