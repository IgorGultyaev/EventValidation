package com.company;

public class Main {
    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Довод", 2020, 18),
                new Movie("Господин Никто", 2009, 18),
                new Movie("Дикие истории", 2014, 16),
                new Movie("Часто задаваемые вопросы о путешествиях во времени", 2009, 0),
                new Movie("", 2010, 16)
        };
    }
    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Увязался М. за Ж", 2022, 16),
                new Theatre("РИККИ-ТИККИ-ТАВИ", 2017, 6),
                new Theatre("", 2017, 0)
        };
    }
    public static void validEvent (Event[] events) throws RuntimeException{
        for (Event event: events) {
            if (event.getTitle().equals("")){
                throw new RuntimeException("the \"title\" field cannot be empty");
            }
        }

    }

    public static void main(String[] args) {

        Movie[] movies = getMovies();
        Theatre[] theatres = getTheatres();

        validEvent(movies);
        validEvent(theatres);

        System.out.println("Все события корректны");

    }
}
