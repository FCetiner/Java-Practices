package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertElementsByIndex {

	public static void main(String[] args) {
		// Add these fruits to their given indexes in a list
		//The ArrayList elements are 
		
		List<String> fruit=new ArrayList<>(Arrays.asList("Apple","Melon","Grape","Banana"));
		
		fruit.add(0,"Honey");
		System.out.println(fruit);
	}

}
