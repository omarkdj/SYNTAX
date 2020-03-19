package com.syntax.class10;

public class TaskCountry {

	public static void main(String[] args) {
		String [] countries= {"USA", "Turkmenistan","Russia","Turkey","France"};
		System.out.println();
		System.out.println("FIRST WAY");
		for (String capital:countries) {
			if (capital.equals("USA")) {
				System.out.println("USA: Washington DC");
			}else if (capital.equals("Turkmenistan")){
				System.out.println("Turkmenistan: Ashgabat");
			}else if (capital.equals("Russia")) {
				System.out.println("Russia: Moscow");
			}else if (capital.equals("Turkey")) {
				System.out.println("Turkey: Ankara");
			}else if (capital.equals("France")) {
				System.out.println("France: Paris");
			}else {
				System.out.println("Incorrect input");
			}
			}
		System.out.println();
		System.out.println("SECOND WAY");
		for (int i=0; i<countries.length; i++) {
			if (i==0) {
				System.out.println("USA: Washington DC");
			}else if (i==1) {
				System.out.println("Turkmenistan: Ashgabat");
			}else if (i==2) {
				System.out.println("Russia: Moscow");
			}else if (i==3) {
				System.out.println("Turkey: Ankara");
			}else if (i==4) {
				System.out.println("France: Paris");
			}
		}
	}

}
