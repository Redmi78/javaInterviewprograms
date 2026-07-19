package Arrays;

import java.util.Arrays;

public class mergesortedArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};

        int[] result = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        // compare both arrays
        while (i < a.length && j < b.length) {

            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        // if elements left in a
        while (i < a.length) {
            result[k++] = a[i++];
        }

        // if elements left in b
        while (j < b.length) {
            result[k++] = b[j++];
        }

        // print result
        System.out.println(Arrays.toString(result)); // Output: [1, 2, 3, 4, 5, 6]
    }
}


