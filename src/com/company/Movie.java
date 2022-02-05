package com.company;

public class Movie extends Event{
    private String title;
    private int releaseYear;
    private int age;

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return  "Название фильма: " + title + " " + " релиз в: " + " " + "Контент " +age;
    }

    public Movie(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }
}
