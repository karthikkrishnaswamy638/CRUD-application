package com.example.demo.BookController;

import com.example.demo.DTO.BookDTO;
import com.example.demo.DTO.BookSaveDTO;
import com.example.demo.DTO.BookUpdateDTO;
import com.example.demo.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(path = "/save")
    public String saveBooks(@RequestBody BookSaveDTO bookSaveDTO)
    {
            String id=bookService.addBook(bookSaveDTO);
            return id;
    }
    @GetMapping(path = "/getAllbook")
    public List<BookDTO>getAllbook()
    {
       List<BookDTO> allbooks = bookService.getAllbook();
       return allbooks;
    }
    @PostMapping(path = "/update")
    public String updateBooks(@RequestBody BookUpdateDTO bookUpdateDTO)
    {
        String id=bookService.updateBooks(bookUpdateDTO);
        return id;
    }
    @DeleteMapping(path = "/deletebook/{id}")
    public String deleteBooks(@PathVariable (value = "id")int id)
    {
        boolean deletebook = bookService.deleteBook(id);
        return "deleted";
    }
}
