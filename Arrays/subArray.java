package Arrays;

public class subArray {
    public static void main(String[] args) {

        int a[] = {2,3,4,5,6};
        int left=0;
        int temp=0;
        int ans;
        for(int right=0;right<a.length;right++)
        {
            temp=temp+a[right];
            System.out.println(temp);
            if(right-left==3)
            {
                temp=temp-a[left];
                left++;
            }
        }
        System.out.println(temp);
    }
}
