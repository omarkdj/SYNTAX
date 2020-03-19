package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		//array are fixed in size 
		
		String [] students=new String[3];
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="kamel";
		
		//students[3]="Aaron"-->during run time java machine will give 
		//   ArrayIndexOutOfBoundsException
		//  System.out.println(students[3]);

		
		String [] ClassStudents=new String [5];
		ClassStudents[1]="Hicham";
		ClassStudents[2]="Omar";
		
		System.out.println(ClassStudents[1]);
	}

}
