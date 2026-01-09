package Arrays;

public class rotateArray {

    public static void rotate(int[] a, int k) {
        int n = a.length;

        // Handle large k
        k = k % n;

        // Step 1: reverse whole array
        reverse(a, 0, n - 1);

        // Step 2: reverse first k elements
        reverse(a, 0, k);

        // Step 3: reverse remaining elements
        reverse(a, k + 1, n - 1);
    }

    private static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 2;

        rotate(a, k);

        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
