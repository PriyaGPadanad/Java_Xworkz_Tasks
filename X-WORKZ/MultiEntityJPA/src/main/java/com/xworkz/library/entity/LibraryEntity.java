package com.xworkz.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="library")
public class LibraryEntity {

    @Id
    private int id;

    @Column(name="libraryname")
    private String libraryName;

    private String location;
    @Column(name="books_available")
    private int booksAvailable;

    private String manager;

    @Column(name="openStatus")
    private boolean open;

    public LibraryEntity(int id, String libraryName, String location, int booksAvailable, String manager, boolean open) {
        this.id = id;
        this.libraryName = libraryName;
        this.location = location;
        this.booksAvailable = booksAvailable;
        this.manager = manager;
        this.open = open;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBooksAvailable() {
        return booksAvailable;
    }

    public void setBooksAvailable(int booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    @Override
    public String toString() {
        return "LibraryEntity{" +
                "id=" + id +
                ", libraryName='" + libraryName + '\'' +
                ", location='" + location + '\'' +
                ", booksAvailable=" + booksAvailable +
                ", manager='" + manager + '\'' +
                ", open=" + open +
                '}';
    }
}
