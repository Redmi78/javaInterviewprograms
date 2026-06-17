package stringPrograms;

public class FirstCharacterOfEachWord {
    public static void main(String[] args) {
        String str = "hello world this is java";
        String[] words = str.split(" ");

        for (int i=0;i< words.length;i++) {
            System.out.println(words[i].charAt(0));
        }

    }
}
