package com.trishala.sde_sheet;

public class MaximumSubArraySum
{
	/* Brute force would be to run two for loops for start and end of window and keep
	 * computing the maxSumVal
	 * T.C = O(n^2)
	 * -----------------------------------------------------------------------
	 * Kadane's Algorithm
	 * It states as far as my sum is a +ve value
	 * I will take it further window and if it's zero then I will move the start to next element
	 * In this way we can also get to print the subarray
	 * T.C = O(n)
	 */

	public static void main(String[] args)
	{
		int[] nums = { -3, -2, -1 };

//		int sum = 0;
//		int maxSum = Integer.MIN_VALUE;
//
//		int StartInd = 0;
//		int endInd = 0;
//		for (int i = 0; i < nums.length; i++)
//		{
//			sum+=nums[i];
//			
//			if (sum < 0)
//			{
//				sum = 0;
//				StartInd = i;
//			}
//			if (sum > maxSum)
//			{
//				maxSum = sum;
//				endInd = i;
//			}
//		}
	       int max = nums[0];
	       int sum = 0;
	       for (int i = 0; i < nums.length; i++) {
	           sum += nums[i];
	           max = Math.max(sum, max);
	           if (sum < 0) sum = 0;
	       }

	       System.out.println("MaxSum" + max);
//		System.out.println("MaxSum: " + maxSum + "\t start: " + StartInd + "\t end: " + endInd);
	}
}
