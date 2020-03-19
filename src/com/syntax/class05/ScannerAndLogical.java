package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
	/* you are a salesman 
	 * ask a user for how much his sales are
	 * based on the amount of his sales we need to calcuate commission
	 * if sales is between 1 -100-->commission should be 10%
	 * if sales is between 100-and 200 -->commission shouled be20%
	 * if sales is between 200 and 500 -->commission should be 30%
	 * if sales is more than 500 --> coomission should be 50%
	 */
		//if your sales ara 200-->40$
		
		//decalare all varibles that i will need
		Scanner scan;
		double sales;
		double commission;
		
		scan=new Scanner(System.in);
		System.out.println("pleas enter your sales amount ");
		sales=scan.nextDouble();
		
		if (sales>=1 && sales<=100) {
		//give user 10%  commission
	    commission=sales*0.10;
		}else if (sales>=100 && sales<=200) {
		commission=sales*0.20;
		}else if (sales>=200 && sales<=500) {
		commission=sales*0.30;
		
		  

	}
  }
}
