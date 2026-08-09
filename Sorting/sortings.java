package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class sortings {
    public static void main(String[] args) {

        // Create a list of movies
        ArrayList<Movie> m = new ArrayList<>();
        m.add(new Movie("Force Awakens", 8.3, 2015));
        m.add(new Movie("Star Wars", 8.7, 1977));
        m.add(new Movie("Empire Strikes Back", 8.8, 1980));
//  // Sort movies by rating and display all
        Collections.sort(m, new Rating());
        System.out.println("Movies sorted by rating:");
        for (Movie m1 : m) {
            System.out.println(m1.getRating() + " " + m1.getName() + " " + m1.getPrice());
        }

        Collections.sort(m, new NameCompare());
        System.out.println("\nMovies sorted by name:");
        for (Movie m1 : m) {
            System.out.println(m1.getName() + " " + m1.getRating() + " " + m1.getPrice());
        }


    }
}