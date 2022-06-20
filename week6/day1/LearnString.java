package week6.day1;

public class LearnString {

	public static void main(String[] args) {
		// String literal
		String s1 = " Welcome to TestLeaf   ";
		String s2 = "Welcome";
		
		// String object
		String s3 = new String("welcome");
		String s4 = new String("Welcome");
		
		// Comparing the value
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		// Comparing the Memory
		System.out.println(s1==s2);
		
		// get the number of characters
		int length = s1.length();
		System.out.println(length);
		
		// to get the string as char array
		char[] charArray = s1.toCharArray();
		
		// to get a specific char
		System.out.println(s1.charAt(0));
		
		// to get the index of specific char
		System.out.println(s1.indexOf('W'));
		
		// to get a part of String
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(1, 6));
		
		// to remove leading and trailing spaces
		System.out.println(s1.trim());
		
		// split the string
		String[] split = s1.trim().split(" ");
		System.out.println(split[0]);
		
		// Replace a specific part in String
		System.out.println(s1.replace(" ", ""));
		
	}

}
