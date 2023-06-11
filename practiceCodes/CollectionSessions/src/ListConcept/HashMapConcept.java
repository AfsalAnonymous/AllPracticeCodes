package ListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		// HashMap is a class implements MapInterface
		// extends AbstractMap
		// contains only unique elements
		// stores the value - key - value pair
		// it may have one null key and multiple null values
		// it maintains no order
		// hashmap is non synchronized -- not thread safe mulitple threads can access
		// the hashmap

		// problem with hashmap
		// removing or add value in hashmap it causes failfast condition
		// concurrent modification exception -- called fail fast condition

		// How Hashmap works internally?
		// Hashmap is an associate array data structure which stores data in the form of
		// key - value pair

		// hashing ---> hashcode ---
		// index will be calculated according to hashcode

		// have four properties
		// Node<K,V>
		// int hash
		// K key
		// V value
		// Node<K,V> next -
		// the hashcode of null is always 0 and index will also be 0th position
		// a 16 index bucket will be opened
		// how a value is stored in hashmap >> First for the key hashcode is generated
		// using the hashcode a index will be generated and the key and
		// >>value will be stored in the index

		// If two key get the same index the node acts as a linked list and stores the
		// value in the next node
		// while using get the method first the hashcode will be calculated and then the
		// index and then the value associated with the key will be returned

		// If there are multiple nodes in the same index then first it will check for
		// the hashcode and then using equals method it will check whether
		// the key are same after finding the same key the value will be returned.

		// After 8 nodes are added to the same index then linked list will be converted
		// into a balanced tree which means left hand side all the smaller
		// values will be stored and right side larger values will be stored which will
		// be easy to search O(log)n will be easy when compared with O(n)

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Afsal");
		hm.put(2, "IronMan");
		hm.put(3, "DoctorStrange");
		hm.put(3, "Thor");

		System.out.println(hm.get(3));

		for (Entry m : hm.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());

		}
		System.out.println(hm);
		hm.remove(3); // to remove a method

		System.out.println(hm);

		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

		Employee e1 = new Employee("Afsal", 24, "Admin");
		Employee e2 = new Employee("Rehman", 24, "QA");
		Employee e3 = new Employee("Thor", 24, "CEO");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(3,null);
		
		emp.put(3, null);

		// traverse the hashmap

		for (Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println(key);
			System.out.println(e.EmployeeName + " " + e.age + "  " + e.Department);

		}
	}

}
