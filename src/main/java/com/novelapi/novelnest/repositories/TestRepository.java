package com.novelapi.novelnest.repositories;

import com.novelapi.novelnest.models.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Test , Long> {

}
