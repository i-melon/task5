package com.example.demo;

public class Book {
    Author author;
    String name;
    Integer pages;
    Integer date;
    public Book(Author author, String name, Integer pages, Integer date){
        this.author = author;
        this.date = date;
        this.name=name;
        this.pages=pages;
    }
}
