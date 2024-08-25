package com.novelapi.novelnest.services;

import com.novelapi.novelnest.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    public String getName(){
        return "Test Susses!";
    }
}
