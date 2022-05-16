package week1.day2;

public class FindDuplicates {

	public static void main(String[] args) {
		//1. Size is mandatory
//		2. Memory wastage
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int length = arr.length;
		
		int count;
		
		for(int i=0; i <length-1; i++) {
			count = 0;
			for (int j = i+1; j < length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count>0) {
				System.out.println(arr[i]);
			}
		}
	}

}
