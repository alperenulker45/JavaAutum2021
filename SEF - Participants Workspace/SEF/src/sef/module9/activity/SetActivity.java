package sef.module9.activity;

//Needs to be completed
import java.util.LinkedHashSet;
import java.util.Set;


public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		LinkedHashSet<String> ls = new LinkedHashSet();
		ls.add("Alperen");
		ls.add("Amiran");
		ls.add("Julia");
		ls.add("Alperen");
		boolean isAdded =ls.add("Julia");
		System.out.println("isAdded = " + isAdded);
		
		//2 - Call print method to print the set passed as its parameter.
		SetActivity setActivity = new SetActivity();
		setActivity.print(ls);
	}
	
	void print(Set set)
	{
		//3 - Type code to print this set
		//Notice the order in which elements get printed.
		for (Object s : set) {
			System.out.println(s);
		}

	}
}
