package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
	/*
	 * write a program to ask user if there is a sale 
	 * if no sale -->not going shopping
	 * if sale we will ask the price of the item 
	 * based on the we will apply discount and calculate final price 
	 * if price less than 20--->apply 10% 
	 * if price less than 20 and 100 --->apply 20% 
	 * if price less than 100 and 500 --->apply 30%
	 * if price less than 20 and 100 --->apply 50% 
	 */
      Scanner scan;
      String sale;
      double price;
      double discount;
     double finalPrice;
     scan=new Scanner(System.in);
      System.out.println("is there is a sale ");
       sale =scan.nextLine();
        
       if (sale.equals("yes")) {
    	  System.out.println("enter the price");
    	      price=scan.nextDouble();
    	      if(price<20) {
    	    	  discount=price*0.1;
    	    	 // finalPrice=price-discount;
    	      }else if((price>20 && price<100)) {
    	    	  discount=price*0.2;
    	    	 // finalPrice=price-discount;
    	      }else if((price>100 && price<500)) {
    	    	  discount=price*0.3;
    	    	//  finalPrice=price-discount;
    	      }else  {
    	    	  discount=price*0.5;
    	    	 // finalPrice=price-discount;
    	      }
    	      finalPrice=price-discount;
    	      System.out.println("After "+discount+" discount the price of the item reduced to "+finalPrice);
      
       }else {
    	   System.out.println("no shopping");
	   }
       
 }
}
