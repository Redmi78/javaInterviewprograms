package stringPrograms;

public class ReverseOnlyCharactersInAString {

    public static void main(String[] args) {
        String str = "1a2b3c";
        char inputArray[] = str.toCharArray();
        int left=0,right=str.length()-1;
        while (left<right)
        {
            if(!Character.isLetter(inputArray[left]))
            {
                left++;
            }
            else if(!Character.isLetter(inputArray[right]))
            {
                right--;
            }
            else {
                char temp;
                temp = inputArray[left];
                inputArray[left] =inputArray[right];
                inputArray[right] =temp;
                left++;
                right--;
            }
        }
        System.out.println(inputArray);


    }
}
