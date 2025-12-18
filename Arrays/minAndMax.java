package Arrays;

public class minAndMax {
    public static void main(String[] args) {

        int a[] ={1,3,2,7,5};
        int minNumber =     Integer.MAX_VALUE;
        int maxNumber =Integer.MIN_VALUE;
        for(int number:a) {
            if (number < minNumber) {
                minNumber = number;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println("Minimum number: " + minNumber);
        System.out.println("Maximum number: " + maxNumber);
    }
}
