package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class removeDuplicatesAndSort {
    public static void main(String[] args) {
       int a[] = {1,2,3,1,4,2,5,3};
       ArrayList<Integer> test = new ArrayList<Integer>();
       for(int b:a)
       {
       test.add(b);
       }
         Collections.sort(test);
       System.out.println(test);
        HashSet<Integer> set = new HashSet<>();
       for(int c:test)
       {
           if(!set.contains(c))
           {
               set.add(c);

           }
        else {
               System.out.println(c);
           }
       }
         System.out.println("Array after removing duplicates: ");
            for(int num : set)
            {
                System.out.print(num+" ");
            }
    }
}
