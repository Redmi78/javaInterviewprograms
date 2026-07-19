package IntegerPrograms;

public class fibnonaciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        int a = 0, b= 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");

            // Compute the next term
            int c = a+b ;
            a = b;
            b = c;
        }
    }
}
