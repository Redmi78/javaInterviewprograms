package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class LimitHashmap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        int maxSize = 100;

        if (map.size() < maxSize) {
            map.put("key", "value");
        }
    }
}