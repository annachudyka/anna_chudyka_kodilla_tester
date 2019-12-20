package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {

    public static void main(String[] args) {

        BookManager bookManager=new BookManager();
        Book book=bookManager.createBook("Harry Potter","J.K.Rowling");
        Book book1=bookManager.createBook("The Lord of The Rings","Tolkien");
        Book book2=bookManager.createBook("Lalka","Bolesław Prus");
        bookManager.createBook("Lalka","Bolesław Prus");

        bookManager.displayBooks();
    }

}
