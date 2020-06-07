package com.syntax.class19;

public class Task {
/*Write program as a Student class   that has instance variables name and address.
 *  Create a constructor that will initialize those variables. 
 *  Print name & address of given  student using displayInfo method.
 */
	
	String name, address;
	
	public Task(String name  ,String address) {
		this.name=name;
	    this.address=address;
	    
	}
	
	public void displayInfo() {
		System.out.println("name of the student is "+name);
		System.out.println("the address of the student is "+address);
	}
	public static void main(String[] args) {
		Task objecte = new Task("Malvin" , "FairFax");
		objecte.displayInfo();
	}
}
