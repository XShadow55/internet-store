package com.example.internetstore;

import org.springframework.context.annotation.Scope;

import java.util.List;

public interface StoreInterface {
    Integer[] add(Integer[] id);
    List get();
}
