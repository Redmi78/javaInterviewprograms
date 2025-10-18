package Pattern;

public class Progam1 {
    public static void main(String[] args) {
     /* 1
        12
        123
        1234
        123
        12
        1*/
int n=5;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}