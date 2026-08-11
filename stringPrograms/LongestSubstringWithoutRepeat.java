package stringPrograms;

import java.util.*;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        String str = "abcabcbb";
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int max = 0;
        int startIndex = 0;

        while (right < str.length()) {
            if (!set.contains(str.charAt(right))) {
                set.add(str.charAt(right));
                max=Math.max(max,right-left+1);

                right++;
            } else {
                set.remove(str.charAt(left));
                left++;
            }
        }


        System.out.println("Length: " + max);
        System.out.println("Substring: " + str.substring(startIndex, startIndex + max));

    }
}