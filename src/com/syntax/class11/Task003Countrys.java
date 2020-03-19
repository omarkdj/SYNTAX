package com.syntax.class11;

public class Task003Countrys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String countries[][] = {
                {"United States","Canada","Mexico","Cuba"},
                {"Brazil","Argentina","Colombia"},
                {"italy","germany"},
                {"Japan","india","Iran"},
                {"Nigeria","Kenya"}
        };
		for (int i =0; i<countries.length; i++) {
			for ( int l=0; l<countries[l].length; l++) {
				System.out.print(countries[i][l]+" ");
			}
			System.out.println();  
		}
		System.out.println("---------using advanced for loop-----------------");
		int count=0;
		for(String[] country:countries) {
			for( String totals:country ) {
				System.out.print(totals+" * ");
			count++;
			}
			System.out.println();
		}
		System.out.println("totals="+count);

	}

}
