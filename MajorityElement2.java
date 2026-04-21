// question 169 Majority Element

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        int maj = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                maj = nums[i];
            }

            if (maj == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return maj;
    }
}

public class MajorityElement2 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Array: " + Arrays.toString(nums));

        int result = sol.majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
}