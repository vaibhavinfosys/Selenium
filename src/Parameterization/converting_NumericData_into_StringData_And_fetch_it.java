package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class converting_NumericData_into_StringData_And_fetch_it {
	public static void main(String[] args) throws Throwable {
		
		//create object of FileInputStream class
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL PC\\Desktop\\java tutorial\\vaibhav2.xlsx");
		
		//open the excel sheet and fetch the data 
		
	String vaibhav = WorkbookFactory.create(fis).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue(); 
	System.out.println(vaibhav);
		
	}

}
