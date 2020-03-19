package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
    // 	Not(!) - reverse the condition
		boolean b=!true;
        boolean val=!false;
        System.out.println(b);
        System.out.println(val);
        
	 boolean isCold=false;
	   if (!isCold) {
		   System.out.println("hello");
	   }else {
		   System.out.println("bye");
	   }
	 String day1="tuesday";
	
	 
	 //if it is not monday or friday -->find me syntax 
	   
	   if(!day1.equals("monday") && !day1.equals("friday") );
	    System.out.println("find me at syntax");  
	
	  if(!(day1.equals("monday") && day1.equals("friday")) );
	    System.out.println("find me at syntax");  
 }
}