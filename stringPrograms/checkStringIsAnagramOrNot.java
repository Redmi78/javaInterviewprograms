package stringPrograms;

import java.util.Arrays;

public class checkStringIsAnagramOrNot {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        char[] c = str1.toCharArray();
        char[] c1 = str2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        if (Arrays.equals(c, c1)) {
            System.out.println("its anagram");
        } else {
            System.out.println("its not anagram");
        }

    }
}
