package week1;

import java.util.Arrays;

public class BigElementofArray {

	public static void main(String[] args) {


		int arr []= {1,2,3,4,5,6};
		
		System.out.println(findMax(arr));
		System.out.println(findMax2(arr));
		
	}

	private static int findMax2(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
		
		
	}

	private static int findMax(int[] arr) {
		
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			if (max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

}
