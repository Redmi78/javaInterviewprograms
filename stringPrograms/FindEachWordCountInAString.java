package stringPrograms;

import java.util.HashMap;

public class FindEachWordCountInAString {
    public static void main(String[] args) {
        String str = "testing the blue sky";
        String[] s1 = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            if (!map.containsKey(s1[i])) {
                map.put(s1[i], 1);
            } else {
                map.put(s1[i], map.get(s1[i]) + 1);
            }
        }

         System.out.println(map);
        for(String key : map.keySet())
        {
            if(map.get(key) > 1)
            {
                System.out.println(key + " = " + map.get(key));
            }
     }

    }
    }

