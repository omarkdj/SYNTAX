package com.syntax.class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Task {

	public static void main(String[] args) throws IOException {

		String filePath = "C:\\Users\\Dell\\eclipse-workspace\\JavaBasics\\configs\\tastFile";

		FileInputStream fileInput = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fileInput);

		String browser = prop.getProperty("browser");
		System.out.println(browser);
		String url = prop.getProperty("url");
		System.out.println(url);
		String username = prop.getProperty("username");
		System.out.println(username);
		String password = prop.getProperty("password");
		System.out.println(password);
		String address= prop.getProperty("address");
		System.out.println(address);

	}
}
