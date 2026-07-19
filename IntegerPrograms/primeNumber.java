package IntegerPrograms;

public class primeNumber {
    public static void main(String[] args) {
        int number=27;
       boolean isPrime=true;
       if(number<=1) {
           isPrime = false;
       }
       else {
           for(int i=2;i<number;i++){
               if(number%i==0){
                   isPrime=false;
                   break;
               }
           }
       }
        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
