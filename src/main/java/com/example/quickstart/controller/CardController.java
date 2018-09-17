package com.example.quickstart.controller;

import com.example.quickstart.dao.CardDao;
import com.example.quickstart.entity.Card;
import com.example.quickstart.entity.User;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

public class CardController {
    @Resource
    private CardDao cardDao ;

    @GetMapping("card")
    public String getAll(ModelMap map){
        List<Card> cardList = cardDao.getCards() ;
        User user = cardDao.getUser();

        map.addAttribute("cardList",cardList) ;
        map.addAttribute("user",user) ;
        return "card" ;
    }
}