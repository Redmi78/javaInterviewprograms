package stringPrograms;

public class aabbbcccctoa2b3c4 {
    public static void main(String[] args) {
        String str = "aabbbcccc";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if ( i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(str.charAt(i) + "" + count);
                count = 1;
            }
        }
    }
}