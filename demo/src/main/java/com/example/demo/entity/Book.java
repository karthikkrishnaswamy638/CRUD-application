package com.example.demo.entity;

import jakarta.persistence.*;
@Entity

@Table(name = "Book")
public class Book {

    @Id
    @Column(name = "book_id",length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookid;

    @Column(name = "book_name",length = 50)

    private String bookname;

    @Column(name = "book_description",length = 100)

    private String description;


    public Book(int bookid,String bookname, String description) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.description = description;
    }

    public Book() {

    }

    public Book(String bookname, String description) {
        this.bookname = bookname;
        this.description = description;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
