package com.domain.services;

import javax.transaction.Transactional;

import com.domain.models.entities.Youtube;
import com.domain.models.repos.YoutubeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class YoutubeService {

    @Autowired
    private static YoutubeRepo youtubeRepo;

    public Youtube save(Youtube youtube){
        return youtubeRepo.save(youtube);
    }

    public static Youtube findOne(Long id) {
        Optional<Youtube>temp = youtubeRepo.findById(id);
        if(!temp.isPresent()){
            return null;
        }
        return youtubeRepo.findById(id).get();
    }

    public Iterable <Youtube> findAll() {
        return youtubeRepo.findAll();
    }
    public static void removeOne(Long id) {
        youtubeRepo.deleteById(id);
    }

    public List<Youtube> findByname(String name) {
        return youtubeRepo.findByContains(name);
        
    }

   
    
}
