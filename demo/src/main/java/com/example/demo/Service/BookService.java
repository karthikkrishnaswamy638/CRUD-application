package com.example.demo.Service;

import com.example.demo.DTO.BookDTO;
import com.example.demo.DTO.BookSaveDTO;
import com.example.demo.DTO.BookUpdateDTO;

import java.util.List;

public interface BookService {

    String addBook(BookSaveDTO bookSaveDTO);

    List<BookDTO> getAllbook();

    String updateBooks(BookUpdateDTO bookUpdateDTO);

    boolean deleteBook(int id);
}
