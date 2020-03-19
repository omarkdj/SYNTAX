package com.syntax.class08;

import java.util.Scanner;

public class TaskLoop03 {

	public static void main(String[] args) {
	//Write a program that reads a range of integers (start and end point),
    //provided by a user and then from that range prints the sum of the even and odd integers.
	
	/*	
		int even=0 , odds=0;
		 Scanner x=new Scanner(System.in);
		  System.out.println("Please enter two numbers ");
		  int min=x.nextInt();
		  int max=x.nextInt();
		  
		  for(int k=min; k<=max ; k++ ) {

			  if(k%2==0) {
				  even=even+k;
				  
			  }else {
				  odds=odds+k;	  
			  }
			  System.out.println("the total of even numbers between "+min+" to "+max+" is "+even);
			  System.out.println("the total of odds numbers between "+min+" to "+max+" is "+odds);
*/
		
		 Scanner inp;
	     int x ;
	    System.out.print("In:");
	    //write code under on step 8
	    
	    inp=new Scanner(System.in);
	    x=inp.nextInt();
	     for (int i=0; i<x; i++){
	     System.out.println(i);
	     }
	     System.out.println(x);
	     
	}
}

	    
	

