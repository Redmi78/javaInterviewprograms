package Arrays;

import java.util.HashSet;

public class findDuplicatesInStringOfArray {
    public static void main(String[] args) {
        String name[] = {"apple", "mango", "apple", "orange"};
        HashSet<String> set = new HashSet<String>();

        for (String nam : name) {
            if (set.contains(nam)) {
                System.out.println(nam);
            } else {
                set.add(nam);
            }
        }

    }
}
