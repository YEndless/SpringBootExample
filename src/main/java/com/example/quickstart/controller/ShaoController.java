package com.example.quickstart.controller;

import com.example.quickstart.dao.BarDao;
import com.example.quickstart.dao.ShaoDao;
import com.example.quickstart.entity.Bar;
import com.example.quickstart.entity.Shao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ShaoController {
    @Resource
    private ShaoDao shaoDao ;
    @Resource
    private BarDao barDao ;
    @GetMapping("ssp")
    public String getAll(ModelMap map){
        List<Shao> shaoList = shaoDao.getShaos();
        List<Bar> barList = barDao.getBars();
        map.addAttribute("shaoList",shaoList) ;
        map.addAttribute("barList",barList) ;
        return "ssp" ;
    }
}
