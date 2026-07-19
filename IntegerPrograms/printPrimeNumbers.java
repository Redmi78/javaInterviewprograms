package IntegerPrograms;

public class printPrimeNumbers {
    public  static void main(String[] args) {
       int num =10;
       int count=0;
       for(int i=0;i<num;i++){
           for(int j=1;j<=i;j++){
               if(i%j==0){
                   count++;
               }
           }
           if(count==2){
               System.out.print(i+" ");
           }
           count=0;

       }
    }
}
