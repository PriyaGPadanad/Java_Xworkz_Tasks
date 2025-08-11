package com.xworkz.library.runner;

import com.xworkz.library.entity.BookEntity;
import com.xworkz.library.entity.LibraryEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class LibraryRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF= Persistence.createEntityManagerFactory("Xworkz");
        EntityManager eM=eMF.createEntityManager();
        EntityTransaction eT=eM.getTransaction();
        eT.begin();

        List<LibraryEntity>libraryEntities=new ArrayList<>();
        libraryEntities.add(new LibraryEntity(1, "Central City Library", "Mumbai", 12000, "Meera Sharma", true));
        libraryEntities.add(new LibraryEntity(2, "Green Valley Library", "Bengaluru", 8500, "Rahul Iyer", true));
        libraryEntities.add(new LibraryEntity(3, "Ocean View Library", "Goa", 4500, "Sneha Nair", false));
        libraryEntities.add(new LibraryEntity(4, "Mountain Peak Library", "Shimla", 2300, "Anuj Thakur", true));
        libraryEntities.add(new LibraryEntity(5, "Desert Light Library", "Jaisalmer", 1800, "Farah Khan", false));
        libraryEntities.add(new LibraryEntity(6, "Tech Hub Library", "Hyderabad", 9600, "Rajeev Menon", true));
        libraryEntities.add(new LibraryEntity(7, "Royal Archive Library", "Jaipur", 7200, "Neelima Bhat", true));
        libraryEntities.add(new LibraryEntity(8, "Coconut Grove Library", "Kochi", 3100, "Abhay George", true));
        libraryEntities.add(new LibraryEntity(9, "Moonlight Library", "Chennai", 5700, "Divya Ramesh", false));
        libraryEntities.add(new LibraryEntity(10, "Riverbend Library", "Pune", 6700, "Vikram Rao", true));

        for(LibraryEntity libraryEntity:libraryEntities){
            eM.persist(libraryEntity);
        }

        LibraryEntity libraryEntity=eM.find(LibraryEntity.class,1);



       List<BookEntity>bookEntities=new ArrayList<>();
        bookEntities.add(new BookEntity(1,"Silent Patient","Alex",300,"history",750.0));
        bookEntities.add(new BookEntity(2,"Deep Work","Cal Newport",280,"Self-help",520.0));
        bookEntities.add(new BookEntity(3,"Atomic habits","James Clear",320,"self-help",600.0));
        bookEntities.add(new BookEntity(4,"Harry Potter","JK Rowling",410,"Fantasy",850.0));
        bookEntities.add(new BookEntity(5,"Clean Code","Robert C Martin",464,"Technology",999.0));
        bookEntities.add(new BookEntity(6,"The Alchemist","Paulo Coelho",208,"Fiction",480.0));
        bookEntities.add(new BookEntity(7,"Educated","Tara Westover",350,"Biography",560.0));
        bookEntities.add(new BookEntity(8, "Sapiens", "Yuval Noah Harari", 498, "History", 780.0));
        bookEntities.add(new BookEntity(9, "Thinking, Fast and Slow", "Daniel Kahneman", 499, "Psychology", 890.0));
        bookEntities.add(new BookEntity(10, "Rich Dad Poor Dad", "Robert Kiyosaki", 276, "Finance", 540.0));

        for(BookEntity bookEntity:bookEntities){
            eM.persist(bookEntity);
        }

        BookEntity bookEntity=eM.find(BookEntity.class,1);

        eT.commit();
        eM.close();
    }
}
