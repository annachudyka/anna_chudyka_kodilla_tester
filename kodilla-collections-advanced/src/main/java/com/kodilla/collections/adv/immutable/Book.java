package com.kodilla.collections.adv.immutable;

public class Book {

    protected String author;//modyfikator dostępu protected=pole(zmienna) jest prywatna ale dostęp do niej mogą mieć również klasy dziedziczące z klasy Book
    protected String title;

    public Book(String author, String title){
        this.author=author;
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
}
