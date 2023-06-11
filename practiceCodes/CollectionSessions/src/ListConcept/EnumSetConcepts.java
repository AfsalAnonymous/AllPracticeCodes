package ListConcept;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcepts {

	// its not synchronized
	// its a highly performance java collection member
	// faster than HashSet
	// all the methods are implemented using bitwise arithmetic operations.

	enum Lang {
		JAVA, CSHARP, JAVASCRIPT, PYTHON, RUBY

	}

	public static void main(String[] args) {

		// created a new enumset using enum
		EnumSet lang = EnumSet.allOf(Lang.class);

		System.out.println(lang);

//empty enum set
		EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
		System.out.println(l);

//range(e1,e2);
		EnumSet<Lang> enumrange = EnumSet.range(Lang.JAVA, Lang.JAVASCRIPT);
		System.out.println(enumrange);

//of:
		EnumSet<Lang> multiplenum = EnumSet.of(Lang.CSHARP);
		System.out.println(multiplenum +"of");

//add and addAll()
		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
		System.out.println(lang1);
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
		lang2.add(Lang.JAVASCRIPT);
		System.out.println(lang2);
		lang2.addAll(lang1);
		System.out.println(lang2);

//how to iterate EnumSet: iterator :
		EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);
		Iterator<Lang> it = fullLang.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
			System.out.println(" , ");
			
			//remove and removeAll()
			
			EnumSet<Lang> remove = EnumSet.allOf(Lang.class);
			System.out.println(remove);
			
			boolean b = remove.remove(Lang.CSHARP);
			System.out.println(b);
			System.out.println(remove);
			
			boolean b1 = remove.removeAll(remove);
			System.out.println(b1);
			System.out.println(remove);
			
		}

	}

}