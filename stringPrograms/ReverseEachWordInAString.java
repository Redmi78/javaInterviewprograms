package stringPrograms;

public class ReverseEachWordInAString {
    public static void main(String[] args) {
        String str = "Sky is blue";
        //output -> ykSsieulb
      String[] stringArray=str.split(" ");
      //s1[0] ="hello",s1[1]="world",s1[2]="testing"
        for(String s :stringArray)
        {
            for(int i=s.length()-1;i>=0;i--)
            {
                System.out.print(s.charAt(i));
            }
        }
        System.out.print(" ");



    }
}
