package com.syntax.class07;

public class WhileTask {

	public static void main(String[] args) {
	int day=1;
	boolean daywork=true;
	
	while(daywork) {
		if (day<6) {
			System.out.println(" i need day off");
			
		}else {
			System.out.println("i dont wanna it");
			daywork=false;
		}
		day++;		
	}	
	}
}
