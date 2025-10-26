package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*| Stream Function             | Use Case             | Example                           |
        | --------------------------- | -------------------- | --------------------------------- |
        | `filter()`                  | Select specific data | Filter prices > 1000              |
        | `map()`                     | Transform data       | Convert product name to uppercase |
        | `distinct()`                | Remove duplicates    | Unique products                   |
        | `sorted()`                  | Sort data            | Price low → high                  |
        | `collect()`                 | Gather result        | Create list of filtered data      |
        | `count()`                   | Count elements       | Count products above a price      |
        | `anyMatch()` / `allMatch()` | Verify conditions    | Check all items in stock          |*/

public class ImportantStreams {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(500, 1200, 3000, 800, 1500);
        prices.stream().filter(p -> p > 1000)
                      .forEach(System.out::println);

     Stream.of("apple", "banana", "cherry", "date","apple")
                .filter(p-> p.length() > 5)
              .forEach(System.out::println);


        List<String> products = Arrays.asList("Shoes", "Bag", "Shoes", "Watch", "Bag");

        Set<String> duplicates = products.stream()
                .filter(p -> Collections.frequency(products, p) > 1)
                .collect(Collectors.toSet());

        System.out.println(duplicates);



        System.out.println(duplicates);
    }
}
