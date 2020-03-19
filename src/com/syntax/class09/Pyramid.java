package com.syntax.class09;

public class Pyramid {

	public static void main(String[] args) {

		for (int r=1; r<=4; r++) {
			for(int c=1; c<=r; c++) {
			System.out.print("*");
		}
			System.out.println();
			//output
			//*
			//**
			//***
			//****

	}
      System.out.println("-------PRINTING TRIANGLE OF NUMBERS----------");
	

		for (int r=1; r<=4; r++) {
			for(int c=1; c<=r; c++) {
			System.out.print(c);
		}
			System.out.println();
			//1
			//12
			//123
			//1234
			}
	}   
}
