// question 189 ROTATE ARRAY
import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int st, int end) {
        while (st < end) {
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }
}

public class RotateArray1 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original: " + Arrays.toString(nums));
        sol.rotate(nums, k);
        System.out.println("Rotated: " + Arrays.toString(nums));
    }
}