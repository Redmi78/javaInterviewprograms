package stringPrograms;

public class ReverseEachWordInAString {
    public static void main(String[] args) {
        String str = "Sky is blue";
      String[] str1=  str.split(" ");
      for(String str2 : str1)
      {
          for(int i=str2.length()-1;i>=0;i--)
          {
            System.out.print(str2.charAt(i));
          }
      }
System.out.print(" ");

      //logic 2


        for(int i=0;i< str1.length;i++)
        {
            for(int j=str1[i].length()-1;j>=0;j--)
            {
                System.out.print(str1[i].charAt(j));
            }
        }
        System.out.print(" ");
    }
}
