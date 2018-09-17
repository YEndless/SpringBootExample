package com.example.quickstart.dao;

import com.example.quickstart.entity.Shao;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Data
@Configuration
public class ShaoDao {
    public List<Shao> getShaos(){
        Shao[] shaos = {
                new Shao("1.png","少数派编辑部","19分钟前","一派 | 苹果秋季发布会你最期待什么新产品？","这一期的一派，少数派编辑们对下周的苹果秋季发布会谈了谈自己最期待的产品以及购置计划。同时我们也想听听大家的想法。",19,11),
                new Shao("2.png","少数派编辑部","19分钟前","一派 | 苹果秋季发布会你最期待什么新产品？","这一期的一派，少数派编辑们对下周的苹果秋季发布会谈了谈自己最期待的产品以及购置计划。同时我们也想听听大家的想法。",19,11),
                new Shao("3.png","少数派编辑部","19分钟前","一派 | 苹果秋季发布会你最期待什么新产品？","这一期的一派，少数派编辑们对下周的苹果秋季发布会谈了谈自己最期待的产品以及购置计划。同时我们也想听听大家的想法。",19,11)
        };
        List<Shao> shaoList = Arrays.asList(shaos) ;
        return shaoList ;
    }

}
