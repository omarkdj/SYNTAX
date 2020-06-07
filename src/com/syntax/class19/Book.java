package com.syntax.class19;

public class Book {

	/*Write program as a Book class   that will have 2 Constructors. 
	 * While creating an object make sure:
      Instance variables are being initialized
      Both Constructors are being executed
	 */
	
	String str, str1 ;
	
	
	Book(String str , String str1){
		this.str=str;
		this.str1=str1;
	}
	void Bookprint () {
		System.out.println(str+" "+str1);		
	}
	public static void main(String[] args) {
		Book obj =new Book("Dark", "White");
		obj.Bookprint();
	}
	
}
