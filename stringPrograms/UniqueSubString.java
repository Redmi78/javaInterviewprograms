package stringPrograms;

public class UniqueSubString {
    public static void main(String[] args) {
        String str = "aabbccddaab";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {

                result=result+ch;
            }
        }
        System.out.println(result);
    }
}
