package com.prog2.labs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class LabSevenTests {

	@Test
	void kthSmallestSubarraySumTest1()  {
		int[] input = {2, 1, 3};

		assertEquals(3, LabSeven.kthSmallestSubarraySum(input, 4));
	}
	
	@Test
	void kthSmallestSubarraySumTest2()  {
		int[] input = {3, 3, 5, 5};

		assertEquals(10, LabSeven.kthSmallestSubarraySum(input, 7));
	}
	
	@Test
	void kthSmallestSubarraySumTest3()  {
		int[] input = {2, 5};

		assertEquals(2, LabSeven.kthSmallestSubarraySum(input, 1));
	}
	
	@Test
	void kthSmallestSubarraySumTest4()  {
		int[] input = {8, 6};

		assertEquals(8, LabSeven.kthSmallestSubarraySum(input, 2));
	}
}