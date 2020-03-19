package com.syntax.class05;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		/*ask a user where he/she is from
		 * basd on the county we will define favoriteFood 
		 * your favorite food is 
		 * 
		 */
		Scanner scan;
		String country;
		String favoriteFood;
		
		scan=new Scanner (System.in);
			System.out.println("pleasw enter your country");	
            country=scan.nextLine();
            
            switch (country) {
              case "Tajikistan":
               favoriteFood  = "osh";
                   break;
               
               case "Morocco":
            	   favoriteFood   = "Couscous";
                    break;   
                  
               case "Belarus":
            	   favoriteFood  = "potato";
                   break;  
                   
               case "Turkey":
            	   favoriteFood  = "baklava";
                  break;    
               default:
               favoriteFood ="unknown";
               
	}
	System.out.println("your favorite food is "+favoriteFood );
}
}
