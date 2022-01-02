package week1;

import java.util.Arrays;
import java.util.Iterator;

public class SortedArray {

	public static void main(String[] args) {


		int arr []= {12,21,3,43,5,6};
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
