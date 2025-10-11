package Arrays;

public class MissingNumberInAArray {
    public static void main(String[] args) {
        int a[] ={1,2,4,5,6};
        int sum=0;
        for(int b :a)
        {
            sum=sum+b;
        }
        System.out.println(sum);
        int totalNumbers =6;
        int sumOfTotalNumbers =(totalNumbers*(totalNumbers+1)/2);
        System.out.println(sumOfTotalNumbers);

        System.out.println(sumOfTotalNumbers-sum);

    }
}
