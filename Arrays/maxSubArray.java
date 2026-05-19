package Arrays;

public class maxSubArray {
    public static void main(String[] args) {

        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j <= a.length; j++) {
                System.out.println("Subarray: start=" + i + ", end=" + j);
            }
        }
    }
}