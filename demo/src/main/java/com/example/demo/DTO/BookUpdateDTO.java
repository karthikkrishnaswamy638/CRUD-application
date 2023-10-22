package com.example.demo.DTO;

public class BookUpdateDTO {

    private int bookid;
    private String bookname;
    private String description;

    public BookUpdateDTO(int bookid, String bookname, String description) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.description = description;
    }

    public BookUpdateDTO() {
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
        return "BookDTO{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
