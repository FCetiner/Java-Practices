package week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		
		// String Builder ande String Buffer we can use reverse methods
		String name="Madam ada madam";
		
		isPalindrome(name);
		isPalindrome2(name);
		System.out.println(isPalindromeFunctional(name));
	}

	private static void isPalindrome2(String name) {
		String reverseName="";
		
		for (int i = name.length()-1; i >=0 ; i--) {
			reverseName+=name.charAt(i);
		}
		
		if (name.equalsIgnoreCase(reverseName)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
		
	}

	private static boolean isPalindromeFunctional(String name) {
		String tempString = name.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, tempString.length() / 2).
        		noneMatch(t-> tempString.charAt(t) != tempString.charAt(tempString.length() - t - 1));
		
	}

	private static void isPalindrome(String name) {
		StringBuilder stb=new StringBuilder(name);
		
		if (stb.reverse().toString().equalsIgnoreCase(name)) {
			System.out.println(name+" is a palindrome word");
		} else {
			System.out.println(name + " is not palindrome word");
		}
		
	}

}
