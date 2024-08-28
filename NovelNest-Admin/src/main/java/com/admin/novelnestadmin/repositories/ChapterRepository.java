package com.admin.novelnestadmin.repositories;

import com.admin.novelnestadmin.entity.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {
}
