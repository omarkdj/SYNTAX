package com.syntax.class07;

public class WhileDoLoop {

	public static void main(String[] args) {
		//hello 5 times
		int num=1;
		
     while(num<=5) {
    	 System.out.println("Hello");
    	 num++;	 
     }
     
     System.out.println("=========using do while loop====================================");
     
     int num1=1;
     
     do {
    	System.out.println("Hello"); 	
    	num1++;
    	
     }while(num1<=5);
                             //output =Hello 5 times
     }
}
