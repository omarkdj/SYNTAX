package com.syntax.class07;

public class ForLoopIntro {

	public static void main(String[] args) {
	   //Good Morning 5 times
	int	sum=0;
		for (int c=1; c<6; c++) {
			System.out.println("Good Morning");
		}
     //print numbers from 10 to 1
		
		for(int i =0; i>=1; i--) {
			System.out.println(i);
		}
	// what will be the out put?
		for(int b=0; b<=50; b+=5) {
			sum=sum+b;
			System.out.println("Value of sum"+b);
		}
	}

}
