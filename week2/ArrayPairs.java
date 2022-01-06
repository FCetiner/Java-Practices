package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPairs {

	public static void main(String[] args) {
		
		List <Integer> nums=new ArrayList<>(Arrays.asList(4,6,5,-10,8,5,20));
		int total=10;
		findPairs(nums,total);

	}

	private static void findPairs(List<Integer> nums, int total) {
		for (int i = 0; i < nums.size(); i++) {
			for (int j = i+1; j < nums.size(); j++) {
				if (nums.get(i)+nums.get(j)==10) {
					System.out.print(nums.get(i)+" "+nums.get(j)+" ");
					System.out.println();
				}
			}
		}
		
	}

}
