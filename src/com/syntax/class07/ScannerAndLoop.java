package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		//we need to ask user's name and print Good Afternoon

		Scanner input;
		String name;
		int num=1;
		
		input=new Scanner (System.in);
		while(num<=5) {
		System.out.println("What is your name");
		
		name=input.nextLine();
		
		System.out.println("Good Afternoon"+name);
		
		num++;
		}
	}

}
