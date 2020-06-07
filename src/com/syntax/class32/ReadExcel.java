package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
	
		String filePath="C:\\Users\\Dell\\Desktop\\JIRA/test.xlsx";
		FileInputStream fis= new FileInputStream(filePath);
		
		//get an Object of Workbook type
		Workbook book= new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet("Sheet1");
		
		// need to  find number of rows
		int rows = sheet.getPhysicalNumberOfRows();
		
		//find number of columns 
		int cols=sheet.getRow(0).getLastCellNum();
		
		//get data from all rows and all columns
		for(int r=0; r<rows; r++) {
			for(int c=0; c<cols; c++){
				String cellVal=sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal+" ");
			}
			System.out.println();
		}
		
	}
	
}
