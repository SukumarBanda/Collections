package com.string.examples;

import java.util.HashMap;
import java.util.Scanner;

public class CountCharacters {
	
	public static void main(String[] args) {
		//main method
		//Adding second line comment
		System.out.println("Enter the String: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		char[] ch = str.toCharArray();
		
		HashMap<Character,Integer> obj = new HashMap<Character,Integer>();
		
		
		for (char c : ch) {
			if(obj.containsKey(ch))
			{
				obj.put(c, obj.get(c)+1);
			}
			else {
				obj.put(c, 1);
			}
		}
		System.out.println("Count od character "+obj);
		System.out.println("=======================");
	}
}
