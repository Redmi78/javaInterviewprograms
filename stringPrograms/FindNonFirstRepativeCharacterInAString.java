package stringPrograms;

import java.util.HashMap;

public class FindNonFirstRepativeCharacterInAString {
    public static void main(String[] args) {
        String str = "testing";
        char[] ch = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequencies
        for (int i = 0; i < ch.length; i++) {
            if (!map.containsKey(ch[i])) {
                map.put(ch[i], 1);
            } else {
                map.put(ch[i], map.get(ch[i]) + 1);
            }
        }

        // Step 2: Find first character with frequency 1
        for (int i = 0; i < ch.length; i++) {
            if (map.get(ch[i]) == 1) {
                System.out.println("First non-repeating character: " + ch[i]);
                return;
            }
        }

    }

}
