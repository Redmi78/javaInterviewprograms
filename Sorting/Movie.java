package Sorting;

public class Movie {
    private String name;
    private double rating;
    private int price;

    public Movie(String name, double rating, int price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getRating() {
        return rating;
    }
    public int getPrice() {
        return price;

    }
}
