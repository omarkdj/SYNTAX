package com.syntax.class14;

public class Task {

	public static void main(String[] args) {
		
	
	   	//write your code below
	   	        String original="racecar";
	   	   		System.out.println(original.trim());
	  
	      String reverse="";
	      for (int i = original.length() - 1; i >= 0; i--)
	      reverse = reverse + original.charAt(i);

	       if (original.trim().equals(reverse))
	       System.out.println("The string is a palindrome.");
	       else
	       System.out.println("The string isn't a palindrome.");
	   }
	 }
