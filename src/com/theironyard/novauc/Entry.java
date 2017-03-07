package com.theironyard.novauc;


public class Entry {
    int id;
    String author;
    String text;

    public Entry(int id, String author, String text) {
        this.id = id;
        this.author = author;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }
}
