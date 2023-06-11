package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		
		ArrayList<String> tvshows = new ArrayList<String>();
		tvshows.add("GOT");
		tvshows.add("Breaking Bad");
		tvshows.add("Peaky Blinders");
		tvshows.add("Vikings");
		tvshows.add("Friends");
		
		//1. using java 8 with for each loop and lambda expression :
		System.out.println("Print using for each");
		
		tvshows.forEach(shows -> {
			System.out.println(shows);
		});
		
		//using iterator 
		System.out.println("Print using Iterator");
		Iterator<String> it = tvshows.iterator();
		while(it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}
		
		
		//3.using iterator and java 8 for EachRemaining()method

		System.out.println("Print using iterator and java 8 for EachRemaining()method");
		
		it = tvshows.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);
		});
		
		
		//using for each loop 
		
		System.out.println("Print using for each loop");
		
		for(String show: tvshows) {
			System.out.println(show);
		}
		
		//print using for loop with order 
		
		System.out.println("Print with for loop or index or order");
		for(int i=0; i<tvshows.size();i++) {
			System.out.println(tvshows.get(i));
		}
		
	}

}
