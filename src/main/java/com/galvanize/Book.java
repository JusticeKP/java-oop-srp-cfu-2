package com.galvanize;

public class Book {

    private String bookTitle;
    private int bookYear;
    private Author author = new Author();
    private Publisher pub = new Publisher();




    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookName) {
        this.bookTitle = bookName;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }


    public String getFormattedBookName() {
        return String.format(
                "%s (%s)\nWritten by %s\nPublished by %s",
                getBookTitle(),
                getBookYear(),
                author.getFormattedAuthorName(),
                pub.getFormattedPublisherName()
        );
    }
}
