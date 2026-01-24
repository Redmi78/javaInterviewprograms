package Arrays;

import java.util.Arrays;

public class mergesortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers to the last elements of the original parts
        int a = m - 1;           // Last valid element in nums1
        int b = n - 1;           // Last element in nums2
        int index =nums1.length - 1;   // Last index of nums1 where we place the next largest element

        // Merge arrays from the back
        while (a >= 0 && b >= 0) {
            if (nums1[a] > nums2[b]) {
                nums1[index] = nums1[a];
                a--;
            } else {
                nums1[index] = nums2[b];
                b--;
            }
            index--;
        }

        // Copy any remaining elements from nums2
        while (b >= 0) {
            nums1[index] = nums2[b];
            b--;
            index--;
        }
        // No need to copy nums1 leftovers—they are already in place
    }

    // Test the function
    public static void main(String[] args) {
        mergesortedArray solution = new mergesortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1)); // Output: [1, 2, 2, 3, 5, 6]
    }
}


