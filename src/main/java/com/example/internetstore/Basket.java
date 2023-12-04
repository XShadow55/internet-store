package com.example.internetstore;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Integer> basket = new ArrayList<>();



    public Integer[] addAll(Integer[] id){
        basket.addAll(List.of(id));
        return id;
    }


    public List<Integer> get() {
        return basket;
    }
}
