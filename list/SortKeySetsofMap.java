package list;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortKeySetsofMap {

	public static void main(String[] args) {

		/*
		 * "a"
		 */
		//sort the elements by using map
		
		SortedMap map=new TreeMap<>();
		
		map.put("a", "One");
		map.put("b", "Two");
		map.put("d", "Four");
		map.put("c", "Three");
		
		System.out.println(map);
		

	}

}
