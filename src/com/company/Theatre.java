package com.company;

public class Theatre extends Event {
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
        return this.title;
    }

    @Override
    public int getReleaseYear() {
        return this.releaseYear;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Название постановки: " + title + " " + " релиз в: " + " " + "Контент " + age;
    }
}
