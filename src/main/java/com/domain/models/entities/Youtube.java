package com.domain.models.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trendings")
public class Youtube implements Serializable{

    private static final long serialVersionUID = 1L;
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String chanel_id;    
    
    private String title;

    private String chanel_title;

    private String published_at;

    public Youtube() {
    }

    public Youtube(Long id, String chanel_id, String title, String chanel_title, String published_at) {
        this.id = id;
        this.chanel_id = chanel_id;
        this.title = title;
        this.chanel_title = chanel_title;
        this.published_at = published_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChanel_id() {
        return chanel_id;
    }

    public void setChanel_id(String chanel_id) {
        this.chanel_id = chanel_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChanel_title() {
        return chanel_title;
    }

    public void setChanel_title(String chanel_title) {
        this.chanel_title = chanel_title;
    }

    public String getPublished_at() {
        return published_at;
    }

    public void setPublished_at(String published_at) {
        this.published_at = published_at;
    }

    
    
    
    
    
}
