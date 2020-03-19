package com.syntax.class09;

public class MorePatterns {

	public static void main(String[] args) {
		
		 
		 for(int n=1; n<=5; n++) {
			 for(int j=1; j<=5; j++) {
			 System.out.print(n);
			 }
			 System.out.println();
			 //output
			 //11111
			 //22222
			 //33333
			 //44444
			 //55555
		 }
		 System.out.println("--------PRINTING 5 ROWS OF 1-9");
		 
		 for (int i=1; i<=5; i++) {
			 for(int y=1; y<=9; y++) {
				 System.out.print(y);
			 }
			 System.out.println();
			 
		    //123456789
		    //123456789
			// 123456789
			// 123456789
			// 123456789

		 }
		 System.out.println("-------PRINTING 5 ROWS OF 54321----");
		 
		 for(int i=1; i<=5; i++) {
			 for (int y=5; y>=1; y--) {
				 System.out.print(y);
			 }
			 System.out.println();
		  /* 54321
			 54321
			 54321
			 54321
			 54321*/
		 }
         System.out.println("-------PRINTINFG 5 ROWS 5555, 44444, 33333, 22222, 11111----");
		 
		 for(int i=5; i>=1; i--) {
			 for (int y=5; y>0; y--) {
				 System.out.print(i);
			 }
			 System.out.println();
			 // 55555
			 // 44444
			 // 33333
			 // 22222
			 // 11111
		 }
	}

}
