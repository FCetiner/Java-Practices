package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayElementstoList {

	public static void main(String[] args) {


		List<String> list1=new ArrayList<>();
		list1.add("Ahmet");
		list1.add("Hasan");
		list1.add("Susan");
		list1.add("Brian");
		list1.add("Peter");
		
		Object[]array= list1.toArray();
		
//		System.out.println(Arrays.toString(array));
		
		//List<String> list2 =new ArrayList<>(Arrays.asList(array));
		
		
		
		
	}

}
