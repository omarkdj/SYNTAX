package com.syntax.class09;

public class TaskNestedLoopCar {
     
     // using nested loops to print car odometer 
	public static void main(String[] args) {
		
		for(int i=0; i<=9; i++) {
			for (int b=0; b<=9; b++) {
				for(int v=0; v<=9; v++) {
					for (int m=0; m<=9; m++) {
						System.out.println(i+"|"+b+"|"+v+"|"+m);
					}
				}
				
			}
		}
			

	}

}
