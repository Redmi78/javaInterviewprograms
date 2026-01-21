package Arrays;

public class MxNumber {
    public static void main(String[] args) {

        int a[] = {1, 3, 2, 7, 5};
       int maxNumber =a[0];
       for(int i=0;i<a.length;i++)
       {
           if(a[i]>maxNumber)
           {
               maxNumber=a[i];

           }
       }
        System.out.println("Maximum number is: " + maxNumber);
    }
}
