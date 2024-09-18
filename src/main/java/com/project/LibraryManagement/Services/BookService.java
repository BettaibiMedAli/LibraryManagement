package com.project.LibraryManagement.Services;

import com.project.LibraryManagement.Models.Book;
import com.project.LibraryManagement.Models.User;
import com.project.LibraryManagement.Repositories.BookRepo;
import com.project.LibraryManagement.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private UserRepo userRepo;

    public List<Book> findall()
    {
        return bookRepo.findAll();
    }

    public Book findByid(Long id)
    {
        return bookRepo.findById(id).orElse(null);
    }

    public Book create(Book book)
    {
        return bookRepo.save(book);
    }

    public void deleteById(Long id)
    {
        bookRepo.deleteById(id);
    }

    public Book borrowBook(Long Bookid, Long Userid)
    {
        Book book = findByid(Bookid);
        User user = userRepo.findById(Userid).orElse(null);

        if(book != null && book.isBorrowed() == false && user != null)
        {
            book.setBorrowed(true);
            book.setBorrowedBy(user);
            return create(book);
        }
        return null;
    }

    public Book returnBook(Long bookid)
    {
        Book book = findByid(bookid);
        if(book != null && book.isBorrowed())
        {
            book.setBorrowedBy(null);
            book.setBorrowed(false);
            return create(book);
        }
        return null;
    }
}
