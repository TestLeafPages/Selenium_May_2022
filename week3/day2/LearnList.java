package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class LearnList {

	public static void main(String[] args) {
		
		// List -> Dynamic Array 
		// List -> Interface -> You cannot create an object
		// Hold data that can grow or shrink !! 
		// It allows to hold duplicate data
		// Implementation class -> ArrayList (Index) , LinkedList (Next, Prev)
		
		
		// Methods 
		/*
		 * size -> how many items are there in the list -> int
		 * add -> add a new item to the list (by default it will add to the last) -> boolean
		 * remove -> remove given index or data from the list (if there are multiple, removes first)
		 * get -> retrieve the specific item using index -> Generic value
		 * contains -> find whether given item is present or not -> boolean
		 */
		
		// Generic -> Stores the type of allowed data in the given data structure --> Class
		List<String> books = new ArrayList<String>();
		books.add("5 AM Club");
		books.add("Play to Win");
		books.add("Alchemist");
		books.add("Ponniyin Selvan");
		System.out.println(books.size()); 
		books.add(0,"The Power of Now"); // great example for overloading 
		System.out.println(books);
		books.remove("Play to Win"); // 1 --> second index
		System.out.println(books);
		System.out.println(books.get(books.size()-1)); // last book
		System.out.println(books.contains("The Power of Now"));
		books.add("The Power of Now"); // great example for overloading 

		Collections.sort(books);
		Collections.reverse(books);
		System.out.println(books);
		
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		
		
		
		

		
		
		

	}

}
