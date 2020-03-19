package com.syntax.class11;

public class Task001 {

	public static void main(String[] args) {
		// Create an array of cars : american, german, korean, italian.
		//Then retrieve all values from that array using 2 different loops

	String [] cars= { "american", "german", "korean", "italian"};
	for(int i=0; i <cars.length; i++) {
		System.out.println(cars[i]);
	}
	System.out.println("-----------------2 way--------");
	
	for( String  car : cars) {
		System.out.println(car);
	}
	}

}
