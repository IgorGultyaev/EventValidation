package com.company;

import java.util.Date;

public abstract class Event {
    public abstract String getTitle();

    public abstract int getReleaseYear();

    public abstract int getAge();

    public abstract String toString();

    public static void validEvent(Event[] events) throws RuntimeException {
        for (Event event : events) {
            if (event.getTitle() == null) {
                throw new RuntimeException("the \"title\" field cannot be empty");
            }
            if (event.getTitle().trim().equals("")) {
                throw new RuntimeException("the \"title\" field cannot be empty");
            }
            if (event.getAge() > 18 || event.getAge() < 0) {
                throw new RuntimeException("age limits should be in the range 0 - 18");
            }
            if (((event.getClass() == Movie.class) && (event.getReleaseYear() < 1985)) ||
                    ((event.getClass() == Theatre.class) && (event.getReleaseYear() < new Date().getYear() + 1900))) {
                throw new RuntimeException("incorrect release date");
            }
        }

    }

}
