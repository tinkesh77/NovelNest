package com.admin.novelnestadmin.repositories;

import com.entity.novelnestentity.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {
}
