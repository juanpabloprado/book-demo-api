package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private Long idCount = 1L;
    private static final List<Book> books = new ArrayList<>();

    static {
        Book book = new Book(1L, "Alicia en el pais de las maravillas", "Lewis Carrol");
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(Long id) {
        return books.get(id.intValue() - 1);
    }

    public Book createBook(Book book) {
        book.setId(++idCount);
        books.add(book);
        return book;
    }

    public void deleteBook(Long id) {
        books.remove(id.intValue() - 1);
    }
}
