package Arrays;

public class secondSmallestNumber {
    public static void main(String[] args) {
        int a[] = {1, 3, 2, 7, 5};
        int smallestNumber = Integer.MAX_VALUE;
        int secondSmallestNumber = Integer.MAX_VALUE;
        for (int number : a) {
            if (number < smallestNumber) {
                secondSmallestNumber = smallestNumber;
                smallestNumber = number;
            } else if (number < secondSmallestNumber && number != smallestNumber) {
                secondSmallestNumber = number;
            }
        }
        System.out.println(secondSmallestNumber);
    }
}