package com.syntax.class11;

public class MorExemples2DArray {

	public static void main(String[] args) {

		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			
			//Double and print array
		   for (double [] arr:a){
		     for(double values:arr){
		     
		       System.out.print(values+" ");
		     
		   }
	      System.out.println();
		}
	}
	}