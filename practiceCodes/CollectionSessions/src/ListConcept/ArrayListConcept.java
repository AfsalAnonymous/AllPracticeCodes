package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		int a[] = new int[3]; // This is a static array the size is fixed
								// to resolve this issue we have arraylist which is a dynamic array
		a[0] = 2;

		// dynamic array -- Arraylist

		ArrayList ar = new ArrayList(); // Non generic Array List as all data types can be added
		ar.add(10);
		ar.add("Afsal");
		ar.add(123.2);
		ar.add(50);
		System.out.println(ar.size());

		ar.add("ee");
		ar.add("rehman");

		System.out.println(ar.size()); // As array list is dynamic we can add any number of values

		// Properties of array list
		/*
		 * It can have duplicate values Its inserts value in order (maintains insertion
		 * order) Not Synchronized so only array list is slow Allows random access to
		 * fetch the element because it stores the values on the basis of Indexes
		 */
		/*
		 * to print all values in array lise we use 1.for loop 2.iterator
		 */

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		ArrayList<Integer> ar1 = new ArrayList<Integer>(); // Generic ArrayList only data type integer can be added
		ar1.add(18);
		// ar1.add("selenium"); cannot be done as it is string
//		ArrayList<E> ar2 = new ArrayList<E>();
//	
//		//Employee class objects 
		Employee e1 = new Employee("Afsal", 24, "QA");
		Employee e2 = new Employee("Rehman", 14, "Dev");
		Employee e3 = new Employee("Ragnar", 34, "Viking");

		// create array list
		ArrayList<Employee> ar3 = new ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);

//iterator to traverse into the ar3 arraylist

		Iterator<Employee> it = ar3.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.EmployeeName);
			System.out.println(emp.age);
			System.out.println(emp.Department);
		}

		// addAll() method is used to merge two arraylist

		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("afsal");
		ar5.add("Yeah");

		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("rehman");
		ar6.add("noooooo");
		ar6.add("test");

		ar5.addAll(ar6);

		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i)+"all");
		}

		// remove all to remove values from cell

		ar5.removeAll(ar6);
		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i)+"Removed");
		}

		// retain all method //
		
		System.out.println("--------------------------------");

		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("afsal");
		ar7.add("Yeah");

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("test");
		ar8.add("rehman");
		ar8.add("noooooo");

		ar7.retainAll(ar8);
		for (int i = 0; i < ar7.size(); i++) {
			System.out.println(ar7.get(i) + " only common value in both list will be printed");
		}

	}

}
