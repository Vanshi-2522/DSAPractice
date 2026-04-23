import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;        
        int j = n - 1;        
        int k = m + n - 1;    

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}

public class MergeSortedArray5 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        System.out.println("Before merge:");
        System.out.println("nums1 = " + Arrays.toString(nums1));
        System.out.println("nums2 = " + Arrays.toString(nums2));

        sol.merge(nums1, m, nums2, n);

        System.out.println("After merge:");
        System.out.println("nums1 = " + Arrays.toString(nums1));
    }
}