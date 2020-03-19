package com.syntax.class08;

import java.util.Scanner;

public class LoopTask {

	public static void main(String[] args) {
		// write a program to calculate sam of odds and sum of even numbers 
	    //1 to 99
		int evensSum=0;
		int OddsSum=0;
		
		 for (int i=1; i<=99; i++) {
			 if(i%2==0) {
				 evensSum=evensSum+i;
				 
			 }else {
				 OddsSum=OddsSum+i;
			 }
			 System.out.println("Sum of numbers +"+evensSum);
			 System.out.println("Sum of numbers +"+ OddsSum);
		 }
	}

}
