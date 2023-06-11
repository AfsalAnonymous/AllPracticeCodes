package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableconcept {

	public static void main(String[] args) {

		//it is similar to hashmap but it is synchronized .
		//stores the value on the basis of key and value 
		//key ---- > Object -----> Hashcode ---- > value
		//Hash code is a object number unique number provided by jvm 32 bit integer
		
		
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "jerry");
		h1.put(3, "Afsal");
		h1.put(4, null);
		h1.put(4, null);
		h1.put(4, null);
		
		//create a clone copy/shallow copy:
		Hashtable h2 = new Hashtable();
		
		h2= (Hashtable)h1.clone();
		
		System.out.println("the value from h1"+h1);
	System.out.println("the value from h2"+h2);
	
	h1.clear(); // to clear
	System.out.println("the value from h1"+h1);
	System.out.println("the value from h2"+h2);
	
	//contains value :
	
	Hashtable ct = new Hashtable();
	ct.put(1, "Ragnar");
	ct.put(2, "Thomas");
	ct.put(3, "Floki");
	
	if(ct.containsValue("Ragnar")) {
		System.out.println("Look who we found : " + ct.get(1));
	}
	
	//print all the values from hash table using -- Enumberation -- elements ()
	Enumeration en = ct.elements();
	System.out.println("Printing using enumeration");
	
	while(en.hasMoreElements()) {
		System.out.println(en.nextElement());
	}
	
	//get all the values from hashtable using -- entry set -- set if hashtable values 
	
	System.out.println("Print using entry set");
	
	Set s = ct.entrySet();
	System.out.println(s);
	
	//to check both hashtables are equeal or not 
	
	Hashtable ct1 = new Hashtable();
	ct1.put(1, "Ragnar");
	ct1.put(2, "Thomas");
	ct1.put(3, "Floki");
	ct1.put(3, "Floki"); //It contains only unique values
	
	System.out.println(ct1);
	//ct1.put(0, null); //Hashtable cannot have null values 
	
 
	if(ct.equals(ct1))
		System.out.println("both are equal");
	
	//get the value from a key
	
	System.out.println(ct.get(1));
	
	//get the hashcode of hashtable object 
	
	System.out.println(ct1.hashCode());
	System.out.println(ct.hashCode());
	
	//Generics
	
	Hashtable<String, Integer> ct2 = new Hashtable<String, Integer>();
	
	}

}
