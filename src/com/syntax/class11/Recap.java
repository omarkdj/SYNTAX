package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {
		
		
		String [][] groceries= {
				{"cucmber","potato","carrot"},
				{"mango","apple","banana","kiwi"},
				{"milk","cheese","yogurt"}
		};
		System.out.println(groceries[1][2]);
		
		System.out.println("-------------------------------");
		
		//get all values from 2d array
		//loop through rows
		for(int r=0; r<groceries.length; r++) {
			//loop through columns
			for(int c=0; c<groceries[r].length; c++) {
				
				System.out.print(groceries[r][c]+" ");
			}	
		System.out.println();
		}
		System.out.println("--GETING ELEMENTS USING ADVENCED FOR LOOP---");
		
		for (String []array: groceries) {
			
		for (String items:array) {
			System.out.println(items+" ");
		}
		System.out.println();
		
	}
}
}
