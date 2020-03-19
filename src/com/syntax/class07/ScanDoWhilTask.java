package com.syntax.class07;

import java.util.Scanner;

public class ScanDoWhilTask {

	public static void main(String[] args) {
		        // we are plying a lottery and a luCky number is 17;
				//we want to keep asking user any  number from 1-20
				//until he guess the b lucky number -->congrats

		Scanner scan=new Scanner(System.in);                                                  //task 03
		int num;
		int luckynumber=17;
		
		do {
		    System.out.println("Please enter any  number from 1-20");
		    num =scan.nextInt();
			
		    }while(num!=luckynumber);
	        System.out.println("you got it bravoo !!");
		    num++;
   }
}
