package Arrays;

import java.util.HashSet;

public class findDuplicatesInAArray {
    public static void main(String[] args) {

        int a[] = {1,2,3,1};
        System.out.println("Duplicate elements in the array:");
       HashSet<Integer> set = new HashSet<>();
       for(int number : a)
       {
           if(set.contains(number))
           {
               System.out.println(number);
           }
           else
           {
               set.add(number);
           }
       }
    }
}
