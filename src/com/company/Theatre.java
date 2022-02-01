package com.company;

public class Theatre extends Event{
    private String title;
    private int releaseYear;
    private int age;

    public Theatre(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    @Override
    public String getTitle() {
        return null;
    }
}
