package week1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciSequence {

	public static void main(String[] args) {
		
		int num1=0;
		int num2=1;
		int n= 10;
		
		fibonacci(num1,num2,n);
		System.out.println();
		fibonacciList(num1,num2,n);
		System.out.println();
		System.out.println(fibonacciFunctional(num1,num2,n));

	}

	private static long fibonacciFunctional(int num1, int num2, int n) {
		
	return	Stream.iterate(new long[] {1, 1}, f -> new long[] { f[1], f[0] + f[1] })
	    .limit(n)
	    .reduce((a, b) -> b)
	    .get()[0];
		
		 
	}

	private static void fibonacciList(int num1, int num2, int n) {
		List<Integer>list=new ArrayList<>();
		list.add(num1);
		list.add(num2);
		
		for (int i = 1; i < n-1; i++) {
			list.add(list.get(i)+list.get(i-1));
		}
		System.out.println(list);
	}

	private static void fibonacci(int num1, int num2, int n) {

		int temp=0;
		for (int i = 0; i < n; i++) {
			System.out.print(num1+" ");
			temp=num1+num2;
			num1=num2;
			num2=temp;
		}
		
	}

}
