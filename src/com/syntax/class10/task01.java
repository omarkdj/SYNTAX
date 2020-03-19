package com.syntax.class10;

public class task01 {

	public static void main(String[] args) {
		String [] animals= {"Monky","Dog","Cat","Lion","Wolf","Cow"};
		for (String animal:animals) {
			System.out.println(animal);
		}
        System.out.println("-----------another way-----------");
		for (int i=0 ; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		
		//task02
		
		int [] numbers= {27, 43, 87, 322, 32};
		int sum=0;
		for (int i:numbers) {
			sum+= i;

			System.out.println("the sum of the numbers in this array is : "+sum);
		}
	}

}
