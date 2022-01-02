package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReplaceListElement {

	public static void main(String[] args) {


		List<String> fruit=new ArrayList<>(Arrays.asList("Apple","Melon","Grape","Banana"));
		
		Collections.replaceAll(fruit, "Apple", "Honey");
		
		System.out.println(fruit);
		
		

	}

}
