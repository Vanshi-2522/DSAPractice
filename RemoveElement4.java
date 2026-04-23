// QUESTION 27: REMOVE ELEMENT
import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}

public class RemoveElement4 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {3, 2, 2, 3, 4, 3, 5};
        int val = 3;

        System.out.println("Original: " + Arrays.toString(nums));

        int k = sol.removeElement(nums, val);

        System.out.println("k = " + k);

        // show modified valid part of array
        int[] result = Arrays.copyOf(nums, k);

        System.out.println("After removal (first k elements): " + Arrays.toString(result));
    }
}