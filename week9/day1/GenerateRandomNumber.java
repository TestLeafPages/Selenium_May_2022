package week9.day1;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		System.out.println(Math.random());
		
		int ranNum = (int) (Math.random()*9999999+1000000);
		System.out.println(ranNum);

	}

}
