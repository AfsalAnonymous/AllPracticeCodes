package ListConcept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetConcept {

	public static void main(String[] args) {

		/*
		 * Notes: HashSet maintains hashmap internally key and value is followed the
		 * value we add using add()method will act as key in hashmap and value will be
		 * there named PRESENT PRESENT is the constant reference value in set class
		 * private static final variable type Object
		 *
		 *
		 *
		 *
		 *
		 */
		Set<String> hs = new HashSet<String>();
		hs.add("Tesla");
		hs.add("Elon");
		hs.add("Spacex");
		hs.add("Tesla");

		System.out.println(hs);

		System.out.println(hs.contains("Tesla"));

		for (String e : hs)
			System.out.println(e);

		System.out.println("Printing Using iterator **");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		hs.remove("Spacex");
		System.out.println(hs);

		HashSet<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 }));

		Set<Integer> second = new HashSet<>();
		second.addAll(Arrays.asList(new Integer[] { 1, 3, 3, 5, 5, 6, 12, 8, 9, 11 }));

		// get the union
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);

		System.out.println("-----------------");

		// get the intersection
		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);

		System.out.println("-----------------");
		
		// get the differences
		Set<Integer> def = new HashSet<Integer>(second);
		def.removeAll(first);
		System.out.println(def);

	}

}
