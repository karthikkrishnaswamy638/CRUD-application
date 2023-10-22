package com.example.demo.DTO;
public class BookSaveDTO {
    private String bookname;
    private String description;

    public BookSaveDTO(String bookname, String description) {
        this.bookname = bookname;
        this.description = description;
    }

    public BookSaveDTO() {
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
                ", bookname='" + bookname + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
