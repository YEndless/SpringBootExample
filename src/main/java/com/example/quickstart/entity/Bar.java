package com.example.quickstart.entity;

import lombok.Data;

@Data
public class Bar {
    public String barPic ;
    public String barName ;

    public Bar(String barPic, String barName) {
        this.barPic = barPic;
        this.barName = barName;
    }

    public Bar() {

    }
}
