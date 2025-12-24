package stringPrograms;

public class swapTwoStrings {
    public static void main(String[] args) {

        String s1 ="testing";
        String s2="user";

        s1=s1+s2;//s1=11
        s2=s1.substring(0,s1.length()-s2.length());//   s2=7

        s1 = s1.substring(s2.length());//
        System.out.println(s2);
        System.out.println(s1);


        int num =6;

        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println("Not a prime");
                break;
            }
            else {
                System.out.println("Prime");
                break;
            }
        }
    }
}
