package Arrays;

import java.util.HashMap;

public class FrequencYOfArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 3, 3, 4, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : a) {

            if (map.containsKey(num)) {
                // if already present → increment value
                map.put(num, map.get(num) + 1);
            } else {
                // if not present → start with 1
                map.put(num, 1);
            }
        }

        // Step 2: Print frequency
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

    }
}
