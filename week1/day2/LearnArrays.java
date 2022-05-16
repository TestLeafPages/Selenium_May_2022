package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// Collection of items
		// index starts with 0
		int num = 10;
//		0, 1, 2, 3
		// String[] names = {"Haja", "Hari"};
		int[] nums = {10, 30, 20, 40};
		
		int[] nums1 = new int[5];
		nums1[0] = 12;
		nums1[1] = 15;
		System.out.println(nums1[1]);
		
		// get number of items
		int length = nums.length; // 4
		System.out.println(length);
		
		// get first item in array
		System.out.println(nums[0]);
		
		// get last item in array
		System.out.println(nums[length-1]);
		
		// Sort an array
		Arrays.sort(nums);
		
		// print all values in array
		for(int i = 0; i < length; i++) {
			System.out.println(nums[i]);
		}
		
		for(int i = length-1; i >=0; i--) {
			System.out.println(nums[i]);
		}
	}

}
