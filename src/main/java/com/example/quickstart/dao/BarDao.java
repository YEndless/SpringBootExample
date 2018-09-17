package com.example.quickstart.dao;

import com.example.quickstart.entity.Bar;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Data
@Configuration
public class BarDao {
    public List<Bar> getBars(){
        Bar[] bars = {
                new Bar("p.png","少数派带你看苹晚 2018"),
                new Bar("p1.jpg","跑步好搭档"),
                new Bar("p2.jpg","青年居家指南"),
                new Bar("p3.jpg","你应该知道的PPT技巧"),
                new Bar("p4.jpg","给现代人的护眼小技巧"),
        };
        List<Bar> barList = Arrays.asList(bars) ;
        return  barList;
    }
}
