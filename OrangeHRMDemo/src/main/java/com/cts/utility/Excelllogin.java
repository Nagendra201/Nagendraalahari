package com.cts.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelllogin {
//excel sheet data driven for TDD.
	public Object[][] getData() throws IOException {
		Object[][] testData = null;
		// Opening the Excel File
		FileInputStream file = new FileInputStream("groot.xlsx");
		// OPening the workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		// Open the Sheet and pass the sheet name "Login"
		XSSFSheet loginSheet = workbook.getSheet("login");
		// to get the number of row in the excel
		int numberOfData = loginSheet.getPhysicalNumberOfRows();
		System.out.println(numberOfData);
		//
		testData = new Object[numberOfData][2];

		for (int i = 0; i < numberOfData; i++) {
			XSSFRow row = loginSheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			// to get the value of the cells
			testData[i][0] = username.getStringCellValue();
			testData[i][1] = password.getStringCellValue();
			System.out.println(testData[i][0]);
			System.out.println(testData[i][1]);
		}

		return testData;
	}
//excel sheet data driven for cucumber.	

//To read and return username
	public String excel_username(int a) throws IOException {

		FileInputStream fil = new FileInputStream(new File("groot.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet = workbook.getSheet("login2");
		int count = sheet.getLastRowNum();
		System.out.println(count);

		XSSFRow row = sheet.getRow(a);
		XSSFCell cell = row.getCell(0);
		String un = cell.getStringCellValue();

		return un;
	}

	// TO read and return password
	public String excel_password(int b) throws IOException {

		FileInputStream fil = new FileInputStream(new File("groot.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet = workbook.getSheet("login2");
		int count = sheet.getLastRowNum();
		System.out.println(count);

		XSSFRow row = sheet.getRow(b);
		XSSFCell cell1 = row.getCell(1);
		String pwd = cell1.getStringCellValue();

		return pwd;
	}

}
