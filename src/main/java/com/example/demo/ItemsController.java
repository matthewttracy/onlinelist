package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {
    @GetMapping("/items")
    public List<Item> list(){
        List<Item> li = new ArrayList<>();
        li.add(new Item(1, "Hammer"));
        li.add(new Item(2, "Screwdriver"));
        li.add(new Item(3, "Bolt"));
        return li;
    }
}
