package com.syntax.class33;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
	List<Exception> list=ex();
	System.out.println(list.size());
	Iterator<Exception>it=list.iterator();
	while(it.hasNext()) {
		 String mess= it.next().getMessage();
		 System.out.println(mess);
	  }
    }
		public static  List <Exception> ex() {
		List<Exception> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int num = 0;
		try {
			num = scan.nextInt();
		} catch (InputMismatchException e) {
			list.add(e);
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		String str = "Hello";
		try {
			char cha = str.charAt(9);
			System.out.println(cha);
		} catch (StringIndexOutOfBoundsException se) {
			list.add(se);
			System.out.println(se);
			System.out.println(se.getMessage());
		}
		int a = 14,b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException ar) {
			list.add(ar);
			System.out.println(ar);
			System.out.println(ar.getMessage());
		}
		String file = "";
		try {
			FileInputStream fis = new FileInputStream(file);
		} catch (FileNotFoundException fne) {
			list.add(fne);
			System.out.println(fne);
					}
		return list;
		}	
}