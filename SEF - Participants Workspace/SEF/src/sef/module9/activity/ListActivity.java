package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List<String> names = new ArrayList();
		names.add("Alperen");
		names.add("Davids");
		//2 - Call print method to print the list passed as its parameter.
		ListActivity listActivity = new ListActivity();
		listActivity.print(names);
		
	}
	
	void print(List list)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
		for (Object o : list) {
			System.out.println(o.toString());
		}
	}
}
