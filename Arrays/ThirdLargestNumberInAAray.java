package Arrays;

public class ThirdLargestNumberInAAray {
    public static  void main(String[] args) {
       int a[] ={10,20,30,25,45};
       int largest = Integer.MIN_VALUE;
       int secondLargest = Integer.MIN_VALUE;
       int thirdLargest = Integer.MIN_VALUE;
       for(int number:a)
       {
           if(largest<number)
           {
               thirdLargest=secondLargest;
               secondLargest=largest;
               largest=number;
           }
           else if(secondLargest<number&&largest!=number&&thirdLargest!=number)
           {
               thirdLargest=secondLargest;
               secondLargest=number;
           }
           else if(thirdLargest<number&&largest!=number&&secondLargest!=number)
           {
               thirdLargest=number;
           }
       }
       System.out.println(thirdLargest);
    }
}
