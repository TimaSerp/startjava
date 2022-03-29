package com.startjava.graduation_project;

public class Book {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        if (year >= 0 && year <= 2022) {
            this.year = year;
        } else {
            System.out.println("*год издания указан некорректно*");
        }
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}