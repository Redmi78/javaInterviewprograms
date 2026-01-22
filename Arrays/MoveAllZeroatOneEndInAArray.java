package Arrays;

public class MoveAllZeroatOneEndInAArray {
    public static void main(String[] args) {
        int a[] = {1, 0, 2, 0, 3, 0};
        int index=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0){
                int temp;
                temp=a[index];
                a[index]=a[i];
                a[i]=temp;
                index++;
            }
        }

        for(int k=0;k<a.length;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
