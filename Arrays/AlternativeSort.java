package Arrays;

public class AlternativeSort {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int n = a.length;

        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = 0;

        while (left <= right) {
            if (left <= right) {
                result[index++] = a[left++];
            }
            if (left <= right) {
                result[index++] = a[right--];
            }
        }

        // print result
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
