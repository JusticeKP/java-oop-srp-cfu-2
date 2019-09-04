package com.galvanize;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PublisherTest {

    @Test
    public void publisherFormattedNameReturnsCorrectly() {
        Publisher pub = new Publisher();
        pub.setPublisherName("GoodRead");
        pub.setPubisherCity("New York");
        String expected = "Published by GoodRead, New York";
        assertEquals(expected, pub.getFormattedPublisherName());
    }
}
