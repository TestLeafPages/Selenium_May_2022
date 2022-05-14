package week1.day1;

public class LearnConditionalStatements {

	public static void main(String[] args) {
		int age = 34;
		if (age >=60) {
			System.out.println("Senior Citizen");
			if (age > 40) {
				System.out.println("40+");
			}
		}
		else if (age >= 18)
			System.out.println("Eligible to vote");
		else
			System.out.println("Age is less than 18");
	}

}
