package arraypgm;

import java.util.Arrays;

public class ReverseCharacter{
	public static void main(String[] args) {
		String input = "de12ef35777777yu";
		String rev = "";
		String finput = "";
		String replaceAll = input.replaceAll("\\d", "");
		for (int i = replaceAll.length()-1; i >=0; i--) {
			rev= rev+replaceAll.charAt(i);
		}
		//System.out.println(rev);
		
		char[] charArray = input.toCharArray();
		boolean[] flag = new boolean[charArray.length];
		Arrays.fill(flag, false);
		int j =0;
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isAlphabetic(charArray[i])) {
				flag[i]=true;
			}
			if (flag[i]) {
				finput = finput+rev.charAt(j);
				j++;
			}else {
				finput = finput+charArray[i];
			}
				
			}
		System.out.println(finput);
		}
}
