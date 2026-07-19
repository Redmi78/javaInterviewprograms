package stringPrograms;

public class checkStringIsPalindromeOrNot {
    public static void main(String[] args) {
        String str="madak";
      //  char ch[] = str.toCharArray();
        //ch[0]='s' ,ch[1] ='u'
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("reversed a string"+" "+ rev);

        if(str.equalsIgnoreCase(rev))
        {
            System.out.println("its a palindrome");
        }
        else {
            System.out.println("its not a palindrome");
        }
    }
}
