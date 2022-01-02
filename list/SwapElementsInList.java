package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapElementsInList {

	public static void main(String[] args) {
		

		List<String> fruit=new ArrayList<>(Arrays.asList("Apple","Melon","Grape","Banana"));
	
		Collections.swap(fruit, 2, 0);
		
		System.out.println(fruit);

	}

}
