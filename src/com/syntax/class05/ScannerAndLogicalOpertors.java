package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOpertors {

	public static void main(String[] args) {
		/* take age input from a user and then based on age print output
		 * 0-3-->your are a baby if age from 4-5 you are kid if age
		 *  you are a child if age from 13-19-->you are teenager if age from 20
		 *  you are ana adult if age is more or equal to 65--> you are senior
		 */
		
		// 2. 
		int age ;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your age");
		 age=scan.nextInt();
		
	if (age>0) {	 
	    if (age <3) {
			System.out.println("your are a baby");
		}else if(age>=3 && age<=5) {
			System.out.println("you are kid");
		}else if (age>6 && age <=12) {
			System.out.println("you are a child");
		}else if (age>=13 && age<=19) {
			System.out.println("you are teenager");
		}else if (age>20 && age<=65) {
			System.out.println("you are an adults");
		}else {
			System.out.println("you are enjoyng your life");
		}
	} else {
	 	   System.out.println("pleas enter valid number");
		System.out.println("-------------------task-------------------------");
	    }	
   } 
 }

