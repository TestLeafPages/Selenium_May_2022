package week1.day2;

public class LearnSwitchStatement {

	public static void main(String[] args) {
		
		int day = 8;
		
//		if (day == 0)
//			System.out.println("Sunday");
//		else if (day == 1)
//			System.out.println("Monday");
//		else {
//			System.out.println("Not a valid day");
//		}
		
		switch (day) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			default:
				System.out.println("Not a valid day");
				break;
		}
		
	}

}
