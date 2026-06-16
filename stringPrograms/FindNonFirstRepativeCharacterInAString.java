package stringPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindNonFirstRepativeCharacterInAString {
    public static void main(String[] args) {
        String str = "sbbau";
        char[] ch = str.toCharArray();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        // Step 1: Count frequencies
        for (int i = 0; i < ch.length; i++) {
            if (!map.containsKey(ch[i])) {
                map.put(ch[i], 1);
            } else {
                map.put(ch[i], map.get(ch[i]) + 1);
            }
        }

        // Step 2: Find first character with frequency 1
   /*    for (int i = 0; i < ch.length; i++) {
            if (map.get(ch[i]) == 1) {
                System.out.println("First non-repeating character: " + ch[i]);
                return;
            }
        }*/


        for (Character key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println("First non-repeating character: " + key);
                break;
            }

        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println("First non-repeating character: " + e.getKey());
                break;
            }
        }

        int count = 0;
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                count++;
                if (count == 2) {
                    System.out.println("Second non-repeating character: " + e.getKey());
                    break;
                }
            }

        }

    }
}
