package com.example.demo.Service;

import com.example.demo.BookRepo.BookRepo;
import com.example.demo.DTO.BookDTO;
import com.example.demo.DTO.BookSaveDTO;
import com.example.demo.DTO.BookUpdateDTO;
import com.example.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceIMPL implements BookService{

    @Autowired
    private BookRepo bookRepo;
    @Override
    public String addBook(BookSaveDTO bookSaveDTO) {
        Book book =new Book(
                bookSaveDTO.getBookname(),
                bookSaveDTO.getDescription()
        );
        bookRepo.save(book);
        return book.getBookname();
    }

    @Override
    public List<BookDTO> getAllbook() {
        List<Book> getBooks =bookRepo.findAll();
        List<BookDTO> bookDTOList = new ArrayList<>();
        for (Book a:getBooks)
        {
            BookDTO bookDTO = new BookDTO(

                  a.getBookid(),
                  a.getBookname(),
                  a.getDescription()


            );

          bookDTOList.add(bookDTO);
        }
        return bookDTOList;
    }

    @Override
    public String updateBooks(BookUpdateDTO bookUpdateDTO) {
        if (bookRepo.existsById(bookUpdateDTO.getBookid())) {
            Book book = bookRepo.getById(bookUpdateDTO.getBookid());

            book.setBookname(bookUpdateDTO.getBookname());
            book.setDescription(bookUpdateDTO.getDescription());
            bookRepo.save(book);
        }
            else
            {
                System.out.println("Book Id do Not Exist");
            }

            return null;
        }

    @Override
    public boolean deleteBook(int id) {

        if (bookRepo.existsById(id)) {
            bookRepo.deleteById(id);
        }
        else
        {
            System.out.println("Book Id Not Found");
        }

        return true;


        }
}

