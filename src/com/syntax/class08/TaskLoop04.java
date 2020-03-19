package com.syntax.class08;

import java.util.Scanner;

public class TaskLoop04 {

	public static void main(String[] args) {
// Write a program to ask a user to enter item they want to buy and the price of that item.
// Every time user enters money accumulate the amount and tell the user how much is left to pay off the amount. 
// If user give more money program should return a change. 
// Whenever a user done with payments program should say “Thank you for shopping!”

		   
	     Scanner in=new Scanner(System.in);
	     
	     String [] array=new String[7];
	     
	     for (int i=0; i<array.length+1; i++){
	       
	     System.out.println("Please enter day "+(i+1)+" of the week");
	     array[i]=in.next();
	     
	     }
	     for(int i=0; i<=array.length-1; i++){
	       System.out.println(array[i]);
		

			       	
	     }
	}  
     	}
  