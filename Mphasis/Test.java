package Mphasis;

public class Test {
    public static void main(String[] args) {
        String str = "I Love Java";
        String rev = "";
        String rev1 = "";
        //avaJ evoL I
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);


        String str1 = "I Love Java";
        //JavaLoveI
        String[] words = str1.split(" ");
        for (int j = words.length - 1; j >= 0; j--) {
            rev1 = rev1 + words[j];
        }
        System.out.println(rev1);

        String a ="abc-2019";
       String[] b= a.split("-");
        for (String part : b) {
            System.out.println("[" + part + "]");
        }

    }
}
