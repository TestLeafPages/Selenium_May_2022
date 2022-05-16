package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153; // 246 = 8 + 64 + 216 = 288
		int orgNumber = input;
		// (1*1*1) + (5*5*5) + (3*3*3) = 153
		int output = 0;
		while (input>0) {
			int rem = input % 10;
			output = output + (rem * rem * rem);
			input = input/ 10;
			System.out.println(input);
		}
		System.out.println(output);
		System.out.println(input);
		if (orgNumber == output) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong number");
		}
	}

}
