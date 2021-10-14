package sef.module9.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Map;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			Map<String, String> nameMap = new HashMap<>();
			nameMap.put("name1", "Alperen");
			nameMap.put("name2", "Davids");
			nameMap.put("name3", "Julia");

			//2 - Call print method to print the map passed as its parameter.
			MapActivity mapActivity = new MapActivity();
			mapActivity.print(nameMap);
		
		}
		
		void print(Map map)
		{
			//3 - Type code to print this map
			System.out.println("map = " + map);
			
			//Second way
		//for (Map.Entry <String, String> keyValue : map.entrySet())//burada MAP i hem KEY hem VALUE alacak sekilde.
		//{
		//	System.out.println("keyValue.getKey() = " + keyValue.getKey());//Keyler yazilacak
		//	System.out.println("keyValue.getValue() = " + keyValue.getValue());//Value ler yazilacak.
		//}
		}
	}
