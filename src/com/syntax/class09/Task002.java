package com.syntax.class09;

public class Task002 {

	public static void main(String[] args) {
		// create an array of countries: north america countries, south america countries, europe countries,
		//asian countries, african countries.
		//Then print all values from that array using 2 different loops and calculate how many total countries been stored.
		
		String[][] cars= {
				{"Ford", "Chevrolet","Chrysler","Cadillac"}, 
				{"BMW", "Audi", "Mercedes-Benz", "Porsche"}, 
				{"Hyundai", "Kia", "Daewoo"}, 
				{"Ferrari","Fiat", "Lamborghini", "Maserati" }
				};
	
         for(String[] car:cars) {
        	 for (String total:car) {
        		 System.out.print(total+" ");
        	 }
        	 System.out.println();
         }
         System.out.println("-----------------for loop--------------------");
         for (int i=0; i<cars.length; i++) {
        	 for (int a=0; a <cars[i].length; a++) {
        		 System.out.print(cars[i][a]+" ");
        	 }
        	 System.out.println();
         }

		
	}

}
