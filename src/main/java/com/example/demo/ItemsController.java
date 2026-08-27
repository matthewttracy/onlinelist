package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {

    private List<Item> li = new ArrayList<>();

    @GetMapping("/items")
    public List<Item> list(){
        return li;
    }

    @PostMapping("/items")
    public Item add(@RequestBody Item item){
        li.add(item);
        return item;
    }

}
