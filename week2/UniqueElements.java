package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {

		//remove duplicate

		List <String> names= new ArrayList<>(Arrays.asList("ibrahim", "Ahmet","Mehmet","ibrahim"));
		
		removeDuplicate(names);
		removeDuplicate2(names);

	}

	private static void removeDuplicate2(List<String> names) {
		Set<String> uniqueElements=new HashSet(names);
		System.out.println(uniqueElements);
		
	}

	private static void removeDuplicate(List<String> names) {
		for (int i = 0; i < names.size(); i++) {
			for (int j = i+1; j < names.size(); j++) {
				if (names.get(i).equals(names.get(j))) {
					names.remove(i);
				}
			}
		}
		System.out.println(names);
	}

}
