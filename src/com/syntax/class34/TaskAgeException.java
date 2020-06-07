package com.syntax.class34;

public class TaskAgeException {

	public static void main(String[] args) {
		System.out.println("===Task-1========");
		ageVerification(18);
//		ageVerification(15);
		
		System.out.println("Task-2:Create a method checkUserName that will throw a runtime exception.\n"
				+ "Method should throw an exception when entered username is less than 5 characters.");
		
		checkUserName("Saifuz");
	}
	public static void ageVerification(int age) {
		if (age<16) {
			throw new RuntimeException("You are not eligible for DL");
		}else {
			System.out.println("You can apply for DL");
		}
	}
	public static void checkUserName(String name) {
		if (name.length()<5) {
			throw new RuntimeException("User name must be more than 5 Character");
		}else {
			System.out.println("User name is accepted");
		}
	}
}