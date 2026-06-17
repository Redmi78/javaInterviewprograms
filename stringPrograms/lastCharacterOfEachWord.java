package stringPrograms;

public class lastCharacterOfEachWord {
    public static void main(String[] args) {
        String st = "Hello World";
        String[] words = st.split(" ");
        for(int i=0;i<words.length;i++){

            System.out.println(words[i].charAt(words[i].length()-1));
        }
    }
}
