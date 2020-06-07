package com.syntax.class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
public class ReadTaskFiles {
	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\Dell\\eclipse-workspace\\JavaBasics\\configs\\tastFile";
	     FileInputStream fileInput=new FileInputStream(filePath);
	     Properties prop1= new Properties();
	     prop1.load(fileInput);
	     String brow=prop1.getProperty("browser");
	    
	     Set<Object> key=prop1.keySet();
	     for(Object keys:key) {
	    	 System.out.println("key "+keys+" value "+prop1.get(keys));
	     }
	}
}