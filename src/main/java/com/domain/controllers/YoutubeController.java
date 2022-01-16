package com.domain.controllers;

import com.domain.models.entities.Youtube;
import com.domain.services.YoutubeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/youtube")
public class YoutubeController {
    
    @Autowired
    private YoutubeService youtubeService;

    public Youtube create(@RequestBody Youtube youtube) {
        return youtubeService.save(youtube);        
    }

    public Iterable<Youtube> findAll(){
        return youtubeService.findAll();
    }

    @GetMapping("/{id}")
    public Youtube findOne(@PathVariable("id")Long id){
        return YoutubeService.findOne(id);
    }

    @PutMapping
    public Youtube update(@RequestBody Youtube youtube) {
        return youtubeService.save(youtube);        
    }

    @DeleteMapping("/{id}")
    public Object removeOne(@PathVariable("id")Long id){
        YoutubeService.removeOne(id);
        return null;
    }
}
