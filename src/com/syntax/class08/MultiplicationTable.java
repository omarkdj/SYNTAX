package com.syntax.class08;

public class MultiplicationTable {

	public static void main(String[] args) {
		/*
		 * we want to create mulitipliction table
		 * 
		 * 1*1=1
		 * 1*2=2
		 * 1*3=4
		 */
         int num=1;

         for (int i=1; i<=10; i++) {
        	 System.out.println(num+" * "+ i +" = "+ i * num);
         }
	}

}
