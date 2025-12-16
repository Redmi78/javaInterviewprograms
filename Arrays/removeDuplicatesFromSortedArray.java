package Arrays;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {

        int[] a = {1, 1, 2, 2, 3, 4, 4, 5};

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1 && a[i] == a[i + 1]) {
                continue;
            } else {
                a[count] = a[i];
                count++;
            }
        }

        // Print result
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
