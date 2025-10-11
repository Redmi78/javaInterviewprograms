package stringPrograms;

public class ReverseVowelsInAString {
    public static void main(String[] args) {
        String str ="subba";
      char inputArray[]=  str.toCharArray();
        String vowel="aeiouAEIOU";
        int left=0,right=str.length()-1;

        while(left<right)
        {
            //indexog
           // String.indexOf(char) method returns:

           // A non-negative index (0 or more) if the character exists in the string.

           // -1 if the character is NOT found.

          //  if (vowel.indexOf(inputArray[left]) == 0)
              //  This condition will only be true when the character is 'a' (because 'a' is at index 0 in the vowel string).

           // So it will treat only 'a' as a vowel.
             //   All other vowels (e, i, o, u, A, E, ...) will be ignored, just like consonants.

            if(vowel.indexOf(inputArray[left])==-1)
            {
                left++;
            }
            else  if(vowel.indexOf(inputArray[right])==-1)
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

            System.out.println(inputArray);
        }
    }

}
