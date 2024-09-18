package com.project.LibraryManagement.Controllers;

import com.project.LibraryManagement.Models.Book;
import com.project.LibraryManagement.Repositories.BookRepo;
import com.project.LibraryManagement.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks()
    {
        return bookService.findall();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id)
    {
        return bookService.findByid(id);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book)
    {
        return bookService.create(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@RequestBody Book book,@PathVariable Long id)
    {
        return bookService.create(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id)
    {
        bookService.deleteById(id);
    }

    @PostMapping("/{bookId}/borrow/{userId}")
    public ResponseEntity<Book> borrowBook(@PathVariable Long bookId, @PathVariable Long userId)
    {
        Book borrowedBook = bookService.borrowBook(bookId,userId);
        if(borrowedBook != null)
        {
            return ResponseEntity.ok(borrowedBook);
        }
        else
        {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/{bookId}/return")
    public ResponseEntity<Book> returnBook(@PathVariable Long bookId)
    {
        Book returnedBook = bookService.returnBook(bookId);
        if(returnedBook != null)
        {
            return ResponseEntity.ok(returnedBook);
        }
        else
        {
            return ResponseEntity.badRequest().build();
        }
    }




}
