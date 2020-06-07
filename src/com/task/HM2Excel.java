package com.task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HM2Excel {

	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir")+"\\testdata\\Test01.xlsx";
		FileInputStream fis= new FileInputStream(filePath);
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet("Sheet1");
		
		int rows =sheet.getPhysicalNumberOfRows();
		int celle=sheet.getRow(0).getLastCellNum();
		

	}
}
