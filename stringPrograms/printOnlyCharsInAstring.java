package stringPrograms;

import java.util.HashMap;

public class printOnlyCharsInAstring {

        public static void main(String[] args) {

            String str = "tes123ting";
            char ch[] = str.toCharArray();

            HashMap<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < str.length(); i++) {

                if (Character.isLetter(ch[i])) {

                    if (!map.containsKey(ch[i])) {
                        map.put(ch[i], 1);
                    } else {
                        map.put(ch[i], map.get(ch[i]) + 1);
                    }
                }
            }

            System.out.println(map);

        }
    }

