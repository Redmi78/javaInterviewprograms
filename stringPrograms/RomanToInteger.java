package stringPrograms;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        String roman = "VII";
        int result = 0, previousValue = 0;

        // Step 1: Initialize the Roman numeral map
        HashMap<Character, Integer> Romanmap = new HashMap<>();
        Romanmap.put('I', 1);
        Romanmap.put('V', 5);
        Romanmap.put('X', 10);
        Romanmap.put('L', 50);
        Romanmap.put('C', 100);
        Romanmap.put('D', 500);
        Romanmap.put('M', 1000);

        // Step 2: Traverse from right to left
        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentChar = roman.charAt(i);
            int currentValue = Romanmap.get(currentChar);

            if (currentValue >= previousValue) {
                result = result + currentValue;
            } else {
                result = result - currentValue;
            }
            previousValue = currentValue;
        }

        System.out.println(result); // Output for "VII" -> 7
    }
}
