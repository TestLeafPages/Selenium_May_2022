package qa;

import java.util.Arrays;

public class ReverseChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nm = "de12ef35xy";

		char[] charArray = nm.toCharArray();
		char[] charArray1 = new char[charArray.length];

		for (int i = 0; i < charArray.length; i++) {

			if (Character.isAlphabetic(charArray[i])) {
				charArray1[charArray.length - i - 1] = charArray[i];
			} else {
				charArray1[i] = charArray[i];
			}

		}

		for (char ch : charArray1) {
			System.out.print(ch);
			
		}
	}

}
