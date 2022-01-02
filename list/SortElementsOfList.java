package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortElementsOfList {

	public static void main(String[] args) {

		//sort all elements of List

		List<String> fruit=new ArrayList<>(Arrays.asList("Apple","Melon","Grape","Banana"));
		
		//Ascending order
		Collections.sort(fruit);
		System.out.println(fruit);

		//Descending order
		
		Collections.sort(fruit,Collections.reverseOrder());
		
		System.out.println(fruit);
	}

}
