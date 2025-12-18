package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sortArrays {
    public static void main(String[] args) {
        String [] names = {"apple", "banana", "orange", "grapes", "kiwi"};
        System.out.println("before sorting:");
        for( String allFruits : names)
        {

            System.out.println(allFruits);

        }

     Arrays.sort(names);

        System.out.println("after sorting:");
        for(String sortedFruits : names)
        {

            System.out.println(sortedFruits);
        }
    }
}
