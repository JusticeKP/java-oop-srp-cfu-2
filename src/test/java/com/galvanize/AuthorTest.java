package com.galvanize;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AuthorTest {

    @Test
    public void authorFormattedNameReturnsCorrectly() {
        Author auth = new Author();
        auth.setAuthorFirstName("Eric");
        auth.setAuthorLastName("Evans");
        String expected =  "Written by Evans, Eric\n";
        assertEquals(expected, auth.getFormattedAuthorName());
    }
}
