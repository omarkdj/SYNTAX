package com.syntax.class08;

import java.util.Scanner;

public class TaskLoop02 {

	public static void main(String[] args) {
		//Create a program that will be asking user to apply for a credit card 10 times.
		//As soon you get an “yes” from a user program should stop asking.

		 Scanner scan=new Scanner(System.in);
		 String user=null;
		 for (int a=1; a<=10; a++) {
			 System.out.println("Do you wanna to aplay for cridit card");
			 user=scan.nextLine();
			 if (user.equals("yes")) {
				System.out.println("Congratutions");
				 break;
			 }
			
		 }
		 
	}

}
