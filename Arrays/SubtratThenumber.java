package Arrays;
import java.util.*;
public class SubtratThenumber {
    //get output from a[] ={98,99,0,35,76}
   // output should be 99-98=1
    public static void main(String[] args) {
        int[] a = {98, 99, 0, 35, 76};

        Arrays.sort(a);  // step 1: sort

        for (int i = 0; i < a.length - 1; i++) {
            int diff = a[i + 1] - a[i];
            System.out.println(a[i + 1] + " - " + a[i] + " = " + diff);
        }
    }
}
