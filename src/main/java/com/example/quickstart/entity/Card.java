package com.example.quickstart.entity;

import lombok.Data;

@Data
public class Card {
    private String imgLink ;
    private String title ;

    public Card() {
    }

    public Card(String imgLink, String title) {
        this.imgLink = imgLink;
        this.title = title;
    }
}
