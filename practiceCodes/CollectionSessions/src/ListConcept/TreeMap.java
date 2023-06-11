package ListConcept;

import java.util.Comparator;
import java.util.Set;

public class TreeMap {

	public static void main(String[] args) {


		//TreeMap<String,Integer> map = new TreeMap<String,Integer>();
		
		//order will be maintained based on keys 

		java.util.TreeMap<Integer,String> tmap = new java.util.TreeMap<>();
		
		tmap.put(500,"Tom");
		tmap.put(2000,"Jerry");
		tmap.put(1000,"Ragnar");
		tmap.put(6000,"Legartha");
		tmap.put(5000,"Walter");
		
		System.out.println(tmap);
		
		System.out.println(tmap.lastKey()); // to get the highest key 
	System.out.println(tmap.firstKey());
	
	Set<Integer> lesserthan = tmap.headMap(5000).keySet(); //to get lower values from the mentioned headmap
	System.out.println(lesserthan);
	
	Set<Integer> higherthan = tmap.tailMap(2000).keySet(); //to get higher value from the mentioned tailmap
	System.out.println(higherthan);
 	
	
	java.util.TreeMap<String,Integer> usermap = new java.util.TreeMap<>();
	
	usermap.put("Tom", 100);
	usermap.put("Ragnar", 200);
	usermap.put("Afsal", 300);
	usermap.put("Walter", 400);
	usermap.put("King", 160);
	usermap.put("JonSnow", 900);
	usermap.put("Raven", 180);
	usermap.put("Ross", 90);
	
	System.out.println(usermap);
	
	java.util.TreeMap<String,Integer> usermap1 = new java.util.TreeMap<>(Comparator.reverseOrder());
	
	usermap1.put("Tom", 100);
	usermap1.put("Ragnar", 200);
	usermap1.put("Afsal", 300);
	usermap1.put("Walter", 400);
	usermap1.put("King", 160);
	usermap1.put("JonSnow", 900);
	usermap1.put("Raven", 180);
	usermap1.put("Ross", 90);
	
	System.out.println(usermap1);
	
	}

}
