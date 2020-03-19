package com.syntax.class12;

public class Task001 {

	public static void main(String[] args) {
		//Create a String and print it in reverse order (Sunday == yadnuS).

       String input="Sunday";
       
      
       
       // getBytes() method to convert string  
       // into bytes[]. 
       byte [] Array = input.getBytes(); 
 
       byte [] result =  new byte [Array.length];  
                 
       // Store result in reverse order into the 
       // result byte[] 
       for (int i = 0; i<Array.length; i++) 
            result[i] =  
            Array[Array.length-i-1]; 
 
       System.out.println(new String(result));
       System.out.println("---------------------------------");
       
   	String str = "Sunday";
	String rev=";";
	for (int i = str.length()- 1; i >= 0; i--) {
		rev = rev + str.charAt(i);
	}
	System.out.print("Rev string is:");
	System.out.println(rev);
       
	}

}
