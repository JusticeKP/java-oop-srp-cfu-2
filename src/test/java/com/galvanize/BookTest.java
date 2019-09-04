package com.galvanize;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void bookFormattedNameReturnsCorrectly() {
        Book book = new Book();
        Author auth = new Author();
        Publisher pub = new Publisher();
        auth.setAuthorFirstName("Eric");
        auth.setAuthorLastName("Evans");
        book.setBookTitle("Domain-Driven Design");
        book.setBookYear(2004);
        pub.setPublisherName("Addison-Wesley");
        pub.setPublisherCity("New York");

        String expected = "Domain-Driven Design (2004)\n" +
                "Written by Evans, Eric\n" +
                "Published by Addison-Wesley, New York";

        assertEquals(expected, book.getFormattedBookName());
    }
}
