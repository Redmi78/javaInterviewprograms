package Arrays;

public class maxSubArray {
    public static void main(String[] args) {

        int a[] = {10,25,45,10,20,45};
        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {

                System.out.print("Subarray: ");

                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + " ");
                }

                System.out.println();
            }
        }
    }
}