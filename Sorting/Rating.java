package Sorting;

import java.util.Comparator;

public class Rating implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return Double.compare(m2.getRating(), m1.getRating());
    }
}
