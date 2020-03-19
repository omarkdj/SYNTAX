package com.syntax.class12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//Task 1
		System.out.println("Enter word:");
		String str=scan.nextLine();
		char[] chr=str.toCharArray();
		for (int a=str.length()-1; a>=0; a--) {
			System.out.print(chr[a]);
		}
		System.out.println();
		//Task 2
		System.out.println("Input your string:");
		String mid=scan.nextLine();
		int length=mid.length();
		if (length%2!=0) {
			char x=mid.charAt(length/2);
			System.out.println(x);
		}
		//Task 3
		System.out.println("Mom's first name?");
		String mom=scan.nextLine();
		System.out.println("Dad's first name?");
		String dad=scan.nextLine();
		System.out.println("Boy or Girl?");
		String gen=scan.nextLine();
		if (gen.contentEquals("Boy")) {
			String partDad=dad.substring(0, 3);
			String partMom=mom.substring(3);
			String name=partDad+partMom;
			System.out.println("Suggested baby name: "+name);
		}else if (gen.contentEquals("Girl")) {
			String partDad=dad.substring(3);
			String partMom=mom.substring(0, 3);
			String name=partMom+partDad;
			System.out.println("Suggested baby name: "+name);
	}
	}
}
