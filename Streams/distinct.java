package Streams;

import java.util.List;

public class distinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 3, 4);

        List<Integer> unique =
                numbers.stream()
                        .distinct()
                        .toList();

        System.out.println(unique);

    }
}
