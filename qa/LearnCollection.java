package qa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnCollection {

	public static void main(String[] args) {
		
		/*
		 * vals.add(20); vals.add(40); vals.add(10);
		 * 
		 * System.out.println(vals.get(1));
		 */
		
		Set<Integer> values = new LinkedHashSet<Integer>();
		values.add(90);
		values.add(70);
		values.add(80);
		
		List<Integer> vals = new ArrayList<Integer>(values);
		
		System.out.println(vals.get(1));
		

	}

}
