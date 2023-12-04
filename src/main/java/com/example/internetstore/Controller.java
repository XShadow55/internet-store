package com.example.internetstore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class Controller {
    private StoreService servis;
    public Controller(StoreService servis) {
        this.servis = servis;
    }


    @GetMapping("/add")
    public Integer[] add(@RequestParam Integer[] id){
        return servis.add(id);
    }
    @GetMapping("/get")
    public List get(){
        return servis.get();
    }

}
