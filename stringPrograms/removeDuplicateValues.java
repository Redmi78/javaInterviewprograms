package stringPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class removeDuplicateValues {
    public static void main(String[] args) {
        //append 0 last

        int a[] = {9, 9, 1, 4, 3, 7, 6, 6, 5, 2, 2, 0, 11, 0};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }

        // Print values that occur only once
        for (int i = 0; i < a.length; i++) {

            if (a[i] != 0 && map.get(a[i]) == 1) {
                System.out.print(a[i] + " ");
            }
        }

        // Append 0 at the end
        System.out.print("0");
    }
}