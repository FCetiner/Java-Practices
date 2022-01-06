package week2;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		/*
		 * Ask user to enter 2 int then ask user to enter which operator they want to
		 * use if addition then print here is the sum of your operation 7 + 4=11 test
		 * data : Addition Subtraction Division Multiplication
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Choose your operation 1) +" + "2)- 3)/ 4)*");
		int operator=scan.nextInt();
		
		switch (operator) {
		case 1:
			add(a,b);
			break;
		case 2:
			subtract(a,b);
			break;
		case 3:
			divide(a,b);
			break;
		case 4:
			multiply(a,b);
			break;

		default:
			System.out.println("Invalid ");
			break;
		}
	}

	private static void multiply(int a, int b) {
		System.out.println(a*b) ;
		
	}

	private static void divide(int a, int b) {
		System.out.println(a/b);
		
	}

	private static void subtract(int a, int b) {
		System.out.println(a-b);
		
	}

	private static void add(int a, int b) {
		System.out.println(a+b);
		
	}

}
