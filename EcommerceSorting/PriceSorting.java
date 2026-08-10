package EcommerceSorting;

public class PriceSorting {
     double price;
     double ratings;
     String name;

    PriceSorting(double price,double ratings,String name) {
        this.price = price;
        this.ratings = ratings;
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public double getRatings() {
        return ratings;
    }
    public String getName()
    {
        return name;
    }
    @Override
    public String toString() {
        return  price + ratings + name;
    }
}
