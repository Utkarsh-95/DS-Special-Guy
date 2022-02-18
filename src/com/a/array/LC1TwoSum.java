package com.a.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1TwoSum {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 7, 9, 11 };
		int target = 7;
		int res[] = twoSum(arr, target);// O/P: {0, 1}
		System.out.println(Arrays.toString(res));

		int result[] = findIndices(arr, target);
		System.out.println(Arrays.toString(result));
	}

	private static int[] twoSum(int[] nums, int target) {// O(n)
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		System.out.println(map);

		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];// 7-2=5

			if (map.containsKey(diff)) {// && map.get(diff) != i) {
				return new int[] { i, map.get(diff) };
			}
		}
		throw new IllegalArgumentException("No two sum solution");

	}

	public static int[] findIndices(int[] num, int target) {// O(n^2)

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] + num[j] == target) {
					return new int[] { i, j };
				}
			}

		}

		return new int[] {};

	}

}
