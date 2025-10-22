package Arrays;

import java.util.HashSet;

public class searchElement {
    public static void main(String[] args) {

        int a[] = {1, 2, 50, 1};
        int number =50;
        System.out.println("Duplicate elements in the array:");
        HashSet<Integer> set = new HashSet<>();
        boolean flag=false;
        for (int i=0;i<a.length;i++) {
            if(number==a[i])
            {
                System.out.println(a[i]);
                flag=true;
                break;
            }
        }
    }
}
