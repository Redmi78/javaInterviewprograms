package Arrays;

public class secondLargestNumberInAArray {
    public static void main(String[] args) {
        int a[] ={1,3,2,7,5};
        int largestNumber =     Integer.MIN_VALUE;
        int secondLargestNumber =Integer.MIN_VALUE;
        for(int number:a)
        {
            if(number > largestNumber)
            {
                secondLargestNumber = largestNumber;
                largestNumber =number;
            }
            else if(number>secondLargestNumber && number != largestNumber)
            {
                secondLargestNumber=number;
            }
        }
        System.out.println(secondLargestNumber);
    }
}
