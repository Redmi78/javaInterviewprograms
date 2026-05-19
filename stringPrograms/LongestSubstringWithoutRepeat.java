package stringPrograms;

import java.util.*;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        String s = "abcabcbb";
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int max = 0;
        int startIndex = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                max=Math.max(max,right-left+1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }


        System.out.println("Length: " + max);
        System.out.println("Substring: " + s.substring(startIndex, startIndex + max));

    }
}