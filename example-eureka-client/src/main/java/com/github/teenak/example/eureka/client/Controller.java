package com.github.teenak.example.eureka.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by teenak on 12/09/15.
 */
@RestController
public class Controller {
    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }

    @RequestMapping(value="/items", produces={"application/json"})
    public List<Book> items() {

        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setId("ISBN-13:978-0439023528");
        book1.setTitle("The Hunger Games (Book 1)");
        book1.setAuthor("Suzanne Collins");
        books.add(book1);

        Book book2 = new Book();
        book2.setId("ISBN-13:978-0345803481");
        book2.setTitle("Fifty Shades of Grey: Book One of the Fifty Shades Trilogy");
        book2.setAuthor("E L James");
        books.add(book2);

        return books;
    }
}
