package com.syntax.class09;

public class Task01 {

	public static void main(String[] args) {
		
		System.out.println("----PRINTIND --------");
    for (int i=5; i>=1; i--) {
    	for (int w=1; w<=i; w++) {
    		System.out.print(i);
    	}
    	System.out.println();
    	/*
	   	 *  55555
			4444
			333
			22
			1
			*/
    	
    }
    System.out.println("----PRINTIND --------");
    
         for (int i=1; i<=5; i++) {
        	 for (int j=1;j<=i; j++) {
        		 System.out.print("*"+" ");
        	 }
        	 System.out.println();
         }
         for (int i=4; i>=1; i--) {
        	 for (int j=1;j<=i; j++) {
        		 System.out.print("*"+" ");
        	 }
        	 System.out.println();  //new line
        
         /*
            * 
			* * 
			* * * 
			* * * * 
			* * * * * 
			* * * * 
			* * * 
			* * 
			* 
		*/
         }
	
	}
}

