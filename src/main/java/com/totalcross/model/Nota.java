package com.totalcross.model;

public class Nota{
    private String title;
    private String description;

    public Nota (String title, String description){
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }    
    
}