package com.syntax.class09;

public class TaskClock {

	public static void main(String[] args) {

		//using nested for to print clock
		 for ( int x=0; x<=24; x++) {
			 for (int y=0; y<60; y++) {
				 if (y<10) {
					 System.out.println(x+":0"+y);
				 }else
				 System.out.println(x +":"+ y);
			 }
	}
	}

}
