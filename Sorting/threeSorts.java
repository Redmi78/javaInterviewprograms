package Sorting;

import java.util.*;

class Movieses {
    String title;
    double rating;
    int year;

    Movieses(String title, double rating, int year) {
        this.title = title;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " | " + rating + " | " + year;
    }
}

public class threeSorts {
    public static void main(String[] args) {

        List<Movieses> movies = new ArrayList<>();

        movies.add(new Movieses("Inception", 8.8, 2010));
        movies.add(new Movieses("Interstellar", 8.7, 2014));
        movies.add(new Movieses("Avatar", 7.8, 2009));
        movies.add(new Movieses("The Dark Knight", 9.0, 2008));
        movies.add(new Movieses("Oppenheimer", 8.8, 2023));

        // Custom sorting using 3 criteria
        movies.sort(
                Comparator.comparing(Movieses::getYear)
                        .reversed()
                        .thenComparing(Movieses::getTitle, Comparator.reverseOrder())
                        .thenComparing(Movieses::getRating)
        );

        for (Movieses movie : movies) {
            System.out.println(movie);
        }
    }
}