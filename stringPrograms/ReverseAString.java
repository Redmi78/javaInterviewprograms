package stringPrograms;

public class ReverseAString {
    public static void main(String[] args) {
        String str ="Subba";
        char ch[] = str.toCharArray();
        //ch[0]='s' ,ch[1] ='u'
        String rev="";
        for(int i=ch.length-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("reversed a string"+" "+ rev);
    }
}
