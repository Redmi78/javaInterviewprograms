package Arrays;

public class MinNumber {
    public static void main(String [] args){
        int a[]={67,2,3,4,5,-1,0,23};
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min)
            {
                min=a[i];

            }

        }
        System.out.println("Minimum number is: "+min);
    }
}
