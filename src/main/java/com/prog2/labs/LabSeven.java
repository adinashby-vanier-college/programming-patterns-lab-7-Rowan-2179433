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
		int n = nums.length;
        int left = Integer.MAX_VALUE;
        int right = 0; 
        
        for (int num : nums) {
            left = Math.min(left, num);
            right += num;
        }
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            int count = 0;
            int sum = 0;
            
            for (int i = 0; i < n; i++) {
                sum += nums[i];
                
                while (sum > mid) {
                    sum -= nums[i - count];
                    count++;
                }
                
              
                count += count;
            }
            
            if (count < k) {
                left = mid + 1; 
            } else {
                right = mid; 
            }
        }
        
        return left; 
	}
}