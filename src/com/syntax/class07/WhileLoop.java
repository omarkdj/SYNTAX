package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
		
/*		
	int num=1;
	while(num<20) {	
		System.out.println(num);
		num+=2;
	}
*/	
	int num=1;
	while(num<=20) {
		
		System.out.println(num++);
		num++;
	//2 way using mod if condition
		int num1 =1;
		while (num1<=20) {
			if (num1 % 2 !=0) {
				System.out.println(num1);
			}
			num1++;
		}
		
	}
    }
}
