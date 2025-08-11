package com.xworkz.inherit.internal.book;

public class BookRunner {
    public static void main(String[] args){
        Book b1=new Book();
        b1.read();
        b1.open();
        b1.close();
        b1.bookmark();
        b1.carry();

        System.out.println("---------");
        Book b2=new Novel();
        b2.read();
        b2.open();
        b2.close();
        b2.bookmark();
        b2.carry();

        System.out.println("--------");
        Novel novel=new Novel();
        novel.read();
        novel.bookmark();
        novel.open();
        novel.close();
        novel.carry();

        System.out.println("-------casting example------------");
        Reader reader = new Reader();
        reader.enjoy(b1);
        reader.enjoy(b2);
        reader.enjoy(novel);
    }

    }

