package com.example.demo;

public class Item {
    private int id; 
    private String content;
    private boolean done;

    public Item(int id, String content){
        this.id = id;
        this.content = content;
        this.done = false;
    }

    public Item() {
        
    }

    public int getId(){
        return id;
    }

    public String getContent(){
        return content;
    }

    public boolean isDone(){
        return done;
    }

    public void setId(int newid){
        id = newid;
    }

    public void setContent(String newcontent){
        content = newcontent;
    }

    public void setDone(boolean newdone){
        done = newdone;
    }

    
}


