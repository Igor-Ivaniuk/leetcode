package com.github.igorivaniuk.leetcode.easy.array;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Example 1:
 *
 * Input: [1,2,3,4,5,6,7] and k = 3
 *
 * Output: [5,6,7,1,2,3,4]
 *
 * Explanation:
 *
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 *
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 *
 * rotate 3 steps to the * right: [5,6,7,1,2,3,4]
 *
 * Example 2:
 *
 * Input: [-1,-100,3,99] and k = 2
 *
 * Output: [3,99,-1,-100]
 *
 * Explanation:
 *
 * rotate 1 steps to the right: [99,-1,-100,3]
 *
 * rotate 2 steps to the right: [3,99,-1,-100]
 *
 * Note:
 *
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem. Could you do
 * it in-place with O(1) extra space?
 */
public class RotateArray {

    class Solution {

        // Rotate the whole array and then rotate the shifted parts separately at the shift location
        public void rotate(int[] nums, int k) {
            if (nums == null || nums.length < 2) {
                return;
            }
            k = k % nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }

        public void reverse(int[] nums, int startIndex, int endIndex) {
            int tmp;
            while (startIndex < endIndex) {
                tmp = nums[startIndex];
                nums[startIndex] = nums[endIndex];
                nums[endIndex] = tmp;
                startIndex++;
                endIndex--;
            }
        }


        // Shift right for 1 element, repeat for k times - O(k*n) - bad
        public void rotateSlow(int[] nums, int k) {
            if (k > 0) {
                int length = nums.length;
                if (length > 0) {
                    for (int rotation = 0; rotation < k; rotation++) {
                        int last = nums[length - 1];
                        for (int i = length - 2; i >= 0; i--) {
                            nums[i + 1] = nums[i];
                        }
                        nums[0] = last;
                    }
                }
            }
        }
    }

}
