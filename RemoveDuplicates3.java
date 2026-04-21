import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        return ++j; // length of unique elements
    }
}

public class RemoveDuplicates3 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 1, 2, 2, 3, 3, 4};

        System.out.println("Original array: " + Arrays.toString(nums));

        int k = sol.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: [");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}