package com.xworkz.inherit.internal.book;

public class Reader {
    public void enjoy(Book book){
        book.read();
        book.open();
        book.close();
        book.bookmark();
        book.carry();

        if(book instanceof Novel){
            System.out.println("book is instanceof Novel");
            Novel novel=(Novel)book;
            novel.review();
        }
    }
}
