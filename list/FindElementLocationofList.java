package list;

import java.util.ArrayList;
import java.util.List;

public class FindElementLocationofList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//Get the location of given words C,E

		List aList = new ArrayList();

		aList.add("A");
		aList.add("B");
		aList.add("C");
		aList.add("D");
		aList.add("E");
		
		System.out.println(aList.indexOf("C"));
		System.out.println(aList.indexOf("E"));
		
		String find="E";
		for (int i = 0; i < aList.size(); i++) {
			if (aList.get(i).equals(find)) {
				System.out.println(i);
			} 
		}
		
		
	}

}
