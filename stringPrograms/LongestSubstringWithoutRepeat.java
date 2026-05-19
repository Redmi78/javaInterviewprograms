package stringPrograms;

import java.util.*;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        String str = "abcadabce";

        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxLength = 0;
        int begin = 0;   // to store start of longest substring

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                start = Math.max(start, map.get(ch) + 1);
            }

            map.put(ch, i);

            // update max and starting index
            if (i - start + 1 > maxLength) {
                maxLength = i - start + 1;
                begin = start;
            }
        }

        // print result
        String result = str.substring(begin, begin + maxLength);

        System.out.println("Longest substring: " + result);
        System.out.println("Length: " + maxLength);
    }
}