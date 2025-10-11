package stringPrograms;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str="he llo world  ";
System.out.println(str.replaceAll(" ",""));

String str1= "#$hello?()";
System.out.println(str1.replaceAll("[^a-zA-z0-9]",""));

    }
}
