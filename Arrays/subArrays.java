package Arrays;

public class subArrays {

        public static void main(String[] args) {

            int[] a = {1, 2, 3};

            for (int start = 0; start < a.length; start++) {

                for (int end = start; end < a.length; end++) {

                    for (int k = start; k <= end; k++) {
                        System.out.print(a[k] + " ");
                    }

                    System.out.println();
                }
            }
        }
    }

