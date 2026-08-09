package Sorting;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        // Sort by name in alphabetical order
        return m1.getName().compareTo(m2.getName());
    }
}
