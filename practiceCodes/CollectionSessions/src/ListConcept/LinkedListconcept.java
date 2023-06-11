package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListconcept {

	public static void main(String[] args) {
	
		LinkedList<String> l1 = new LinkedList<String>();
		
		//add
		
		l1.add("Afsal");
		l1.add("Rehman");
		l1.add("Infosys");
		l1.add("Limited");
	
		//print:
		System.out.println("Linked list display" + l1);
		
		//addfirst
		l1.addFirst("Afsal");
		
		//addlast
		l1.addLast("No");
		
		System.out.println("Linked list displat after"+l1 );
		
		//get
		System.out.println(l1.get(0));
		
		//set
		l1.set(0,"Aama");
		System.out.println("Display after set"+l1);
	
		//remove first
		//remove last
	l1.removeFirst();
	l1.removeLast();
	System.out.println("After removal" + l1);
	
	//removing specific element
	l1.remove(2);
	System.out.println("Removing specific element" +l1);
	
	
	//printing using for loop
	
	for (int i=0;i<l1.size();i++) {
		System.out.println("Using for loop" +l1.get(i));
	
	}
	
	//print using iterator
	System.out.println("Using Iterator");
	Iterator<String>   it = l1.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	//while loop
	int num = 0;
	while(l1.size()>num) {
		System.out.println(l1.get(num));
		num++;
	}
	
	}

	
}
