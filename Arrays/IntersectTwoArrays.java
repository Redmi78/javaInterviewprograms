package Arrays;

import java.util.*;

public class IntersectTwoArrays {

    // Function to find intersection of two arrays
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int left = 0, right = 0;
        List<Integer> resultList = new ArrayList<>();

        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] < nums2[right]) {
                left++;
            } else if (nums1[left] > nums2[right]) {
                right++;
            } else { // nums1[left] == nums2[right]
                resultList.add(nums1[left]);
                left++;
                right++;
            }
        }

        // Convert list to array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    // Main method to test
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] intersection = intersect(nums1, nums2);

        System.out.println("Intersection of arrays: " + Arrays.toString(intersection));
    }
}
