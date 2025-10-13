package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BeStreamsTest {
    public static void main(String[] args) {
        List<String> test = Arrays.asList("test","user","testing");
        test.stream().forEach(test1->System.out.println(test1));
    List<String> allNames =test.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Uppercase names: " + allNames);


     test.stream().forEach(test2 -> System.out.println(test2.length()));

     test.stream().filter(test3 -> test3.length()>4).forEach(test3->System.out.println(test3));
        test.stream().filter(test4 -> test4.length()<=4).forEach(test4->System.out.println(test4));
    }
}
