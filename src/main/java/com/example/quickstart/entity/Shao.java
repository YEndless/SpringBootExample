package com.example.quickstart.entity;

import lombok.Data;

@Data
public class Shao {
    private String imgPic ;
    private String name ;
    private String time ;
    private String title ;
    private String Article ;
    private int like ;
    private int collection ;

    public Shao() {
    }

    public Shao(String imgPic, String name, String time, String title, String article, int like, int collection) {
        this.imgPic = imgPic;
        this.name = name;
        this.time = time;
        this.title = title;
        Article = article;
        this.like = like;
        this.collection = collection;
    }
}
