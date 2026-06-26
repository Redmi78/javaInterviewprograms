package stringPrograms;

public class firstLetterCapital {
    public static void main(String[] args){

        String str = "hello world";
        String[] words = str.split(" ");
        String capitalizedString = "";
        for (String word : words) {
            capitalizedString =capitalizedString+ Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(capitalizedString.trim());
    }
}
