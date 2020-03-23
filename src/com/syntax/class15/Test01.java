package com.syntax.class15;

public class Test01 {

	char mark(int a) {
		char grade;
		if(a>90) {
			grade='A';
		}else if (a<=90 && a>80) {
			grade='B';
		}else if (a<=80 && a>70) {
			grade='C';
		}else {
			grade='F';
		}return grade;
	}
    public static void main(String[]args) {
				
     Test01 obj =new Test01();
	 char grade=obj.mark(75);
	 System.out.println(grade);
	}
}