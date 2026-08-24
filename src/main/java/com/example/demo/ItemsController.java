package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {

    List<Item> li = new ArrayList<>();

    @GetMapping("/items")
    public List<Item> list(){
        return li;
    }
}
