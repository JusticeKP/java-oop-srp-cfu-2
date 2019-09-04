package com.galvanize;

public class Publisher {

    public Publisher(){

    }

    private String publisherName;
    private String publisherCity;

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherCity() {
        return publisherCity;
    }

    public void setPublisherCity(String publisherCity) {
        this.publisherCity = publisherCity;
    }

    public String getFormattedPublisherName() {
        return String.format("%s, %s", getPublisherName(), getPublisherCity());
    }
}
