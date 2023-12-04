package com.example.internetstore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class StoreService implements StoreInterface {

    public Basket basket(){return new Basket();
    }
    private Basket bascet = basket();


    @Override
    public Integer[] add(Integer[] id){
        Integer[] product = id;
        bascet.addAll(product);
        return product;
    }
    @Override
    public List get(){

        return bascet.get();
    }

}
