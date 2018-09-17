package com.example.quickstart.dao;

import com.example.quickstart.entity.Card;
import com.example.quickstart.entity.User;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Data
@Configuration
public class CardDao {
    public List<Card> getCards() {
        Card[] cards = {
                new Card("1.png", "a"),
                new Card("2.png", "b"),
                new Card("3.png", "c"),
        };
        List<Card> cardList = Arrays.asList(cards) ;
        return  cardList ;
    }

    public User getUser(){
        User user = new User() ;
        user.setName("taotaotao");
        user.setAvatar("1.png");
        return user ;
    }
}
