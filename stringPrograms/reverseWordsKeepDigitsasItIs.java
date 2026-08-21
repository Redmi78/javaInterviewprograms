package stringPrograms;

public class reverseWordsKeepDigitsasItIs {

        public static void main(String[] args) {

            String str = "32test65";

            char[] c = str.toCharArray();

            int start = 0;

            for (int i = 0; i <= c.length; i++) {

                if (i == c.length || Character.isDigit(c[i])) {

                    int left = start;
                    int right = i - 1;

                    while (left < right) {
                        char temp = c[left];
                        c[left] = c[right];
                        c[right] = temp;

                        left++;
                        right--;
                    }

                    start = i + 1;
                }
            }

            System.out.println(c);
        }
    }
