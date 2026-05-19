package stringPrograms;

public class revpractice {
    public static void main(String[] args) {
        String str = "abc ab a";
      char[] ch=  str.toCharArray();
      String rev="";
      for(int i=ch.length-1;i>=0;i--)
      {          rev=rev+ch[i];
      }
      System.out.println(rev);
    }
}
