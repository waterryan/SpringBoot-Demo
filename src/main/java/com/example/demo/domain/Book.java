package com.example.demo.domain;

import java.io.Serializable;

public class Book implements Serializable {

    private Integer id;
    private String title;
    private String author;
    private String image;

    public Book() {
        super();
    }

    public Book(Integer id, String title, String author, String image) {
        this.id = id;
        this.title = title;
        this.author = author;

        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
