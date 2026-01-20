package Arrays;

import java.util.Arrays;

public class twoSumArray {

    public static void main(String[] args) {
        int a[] = {1, 3, 2, 7, 5};
        int target = 9;
        int left=0,right=a.length-1;
        Arrays.sort(a);
while(left<right)
{
    if(a[left]+a[right]==target)
    {
        System.out.println("Pair found: (" + a[left] + ", " + a[right] + ")");
        break;
    }
    else if(a[left]+a[right]<target)
    {
        left++;
    }
    else
    {
        right--;
    }
}
        System.out.println(Arrays.toString(a));
    }
}
