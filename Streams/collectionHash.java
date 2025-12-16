package Streams;

import java.util.HashMap;
import java.util.HashSet;

public class collectionHash {
    public static void main(String[] args) {
        String str = "testing the user with testing";
        String[] str1 = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length; i++) {
            if (!map.containsKey(str1[i])) {
                map.put(str1[i], 1);
            } else {
                map.put(str1[i], map.get(str1[i]) + 1);
            }
        }
        System.out.println(map);
        HashSet<String> uniqueWords = new HashSet<>(map.keySet());
        HashSet<Integer> uniqueWords1 = new HashSet<>(map.values());
        System.out.println(uniqueWords);
        System.out.println(uniqueWords + ":" + uniqueWords1);
    }
}
