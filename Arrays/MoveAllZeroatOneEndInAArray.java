package Arrays;

public class MoveAllZeroatOneEndInAArray {
    public static void main(String[] args) {
        int a[] = {1, 0, 2, 0, 3, 0};
        int nonzeroValue = 0; //: the index where the next non‑zero should be placed.
        int temp;
        for (int currentValue = 0; currentValue < a.length; currentValue++) {
            if (a[currentValue] != 0) {

                temp = a[nonzeroValue];
                a[nonzeroValue] = a[currentValue];
                a[currentValue] = temp;
                nonzeroValue++;
            }
        }
        for (int n : a) {
            System.out.println(n);
        }
    }
}
