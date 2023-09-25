package com.prog2.labs;

/**
 * @author RowanLajoie
 *
 */

public class LabSeven {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {

	}

	/**
	 * Please refer to the README file for question(s) description
	 */

	public static int kthSmallestSubarraySum(int[] nums, int k) {
        int left = Integer.MAX_VALUE;
        int right = 0; 

        for (int num : nums) {
            left = Math.min(left, num);
            right += num;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            
            int count = countSubarrays(nums, mid);

            if (count < k) {
                left = mid + 1; 
            } else {
                right = mid;
            }
        }

        return left; 
    }

   
    private static int countSubarrays(int[] nums, int target) {
        int count = 0;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > target) {
                sum -= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}