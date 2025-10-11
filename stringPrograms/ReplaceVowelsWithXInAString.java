package stringPrograms;

public class ReplaceVowelsWithXInAString {
    public static void main(String[] args) {
        String str="testing";
        String vowels="aeiouAEIOU";
        StringBuilder result = new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(vowels.indexOf(ch)!=-1)
            {
                result.append('X');
            }
            else
            {
                result.append(ch);
            }
        }
        System.out.println("Original: " + str);
        System.out.println("Modified: " + result.toString());
    }
}
