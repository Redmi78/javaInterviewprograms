package stringPrograms;


import java.util.HashMap;


public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        String str = "abcadabce";
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, i);
            length = Math.max(length,i - start + 1);


        }
        System.out.println("Current longest substring length without repeating characters ending at index " + ": " + length);
    }

}