package EcommerceSorting;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ecommerce {
    public static void main(String[] args) {
        List<PriceSorting> products = new ArrayList<>();
        products.add(new PriceSorting(10000, 4.5, "jeans"));
        products.add(new PriceSorting(5000, 4.0, "t-shirt"));
        products.add(new PriceSorting(20000, 4.8, "shoes"));

        products.sort(Comparator.comparing(PriceSorting::getRatings).reversed()
                .thenComparing(PriceSorting::getPrice)
                .thenComparing(PriceSorting::getName));

        for (PriceSorting product : products) {
            System.out.println(product.getName() + " " + product.getPrice() + " " + product.getRatings());
        }

    }
}