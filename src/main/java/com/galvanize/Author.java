package com.galvanize;

public class Author {

    public Author(){

    }
    private String authorFirstName;
    private String authorLastName;

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }
    public String getFormattedAuthorName() {
        return String.format("%s, %s", getAuthorLastName(), getAuthorFirstName());
    }

}
