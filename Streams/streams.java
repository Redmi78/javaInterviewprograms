package Streams;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Stream;

public class streams {
    public static void main(String[] args) {
      List<Integer> test = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Stream<Integer> stream = test.stream();
        stream.forEach(ele -> System.out.println(ele));


    }
}
