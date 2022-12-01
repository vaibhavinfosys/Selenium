package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class String_Data_Fetching {
	public static void main(String[] args) throws Throwable {
		 //create object of FileInputStream class.
	FileInputStream fis=new FileInputStream("C:\\Users\\DELL PC\\Desktop\\java tutorial\\vaibhav.xlsx");
	
	//open excel sheet and fetching data from excel sheet.
	String vaibhav = WorkbookFactory.create(fis).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(vaibhav);
	}

}
