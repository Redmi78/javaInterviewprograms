package stringPrograms;

public class countVowelsAndConsonentsInAString {
    public static void main(String[] args) {
        String str = "hello world";
        int vowels = 0;
        int consonents = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonents++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonents: " + consonents);
    }
}
