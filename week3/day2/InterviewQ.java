package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class InterviewQ {
	
	// String company Name = "amazon"
	// Print the string after removing the dups --> amzon
	
	public static void main(String[] args) {
		
		String companyName = "amazon";
		
		// converted to character array 
		char[] allChars = companyName.toCharArray();
		
		// Create Set of Character
		Set<Character> unique = new LinkedHashSet<Character>();
		
		// travel to each character
		for (int i = 0; i < allChars.length; i++) {
			if(unique.add(allChars[i])) {
				System.out.print(allChars[i]);
			}
		}
		
		
	}

}
