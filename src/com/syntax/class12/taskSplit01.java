package com.syntax.class12;

public class taskSplit01 {

	public static void main(String[] args) {
     //Create a String that will hold a sentence. Write a program to get a new String without any spaces.
//
//		String world =" Hello World are you ready ";
//		
//		world=world.replace(" ", "");		
//			System.out.print(world);
		
//		String given="I love Java classes at Syntax";
//		System.out.println(given.substring(12));
//		System.out.println(given.substring(0, 11));
		
		String subject="I love Java and I want to learn more";
		String [] splittedSub = subject.split(" ");
		System.out.println(splittedSub.length);
		for (int i = 0; i< splittedSub.length; i++){
		{System.out.println(splittedSub[i]);}
		}
		   
	}
		}