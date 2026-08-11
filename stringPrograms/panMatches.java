package stringPrograms;

public class panMatches {
    public static void main(String[] args) {
        String str = "FBKCT1234T";

        boolean isPan = str.matches("[A-Z]{5}[0-9]{4}[A-Z]");

        System.out.println(isPan); // true
    }
}