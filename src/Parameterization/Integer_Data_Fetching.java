package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Integer_Data_Fetching {
	public static void main(String[] args) throws Throwable {
		//create object of FileInputStream class.
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL PC\\Desktop\\java tutorial\\vaibhav1.xlsx");
		
		//open the excel sheet and fetching data from excel sheet.
		double vaibhav = WorkbookFactory.create(fis).getSheet("sheet1").getRow(2).getCell(2).getNumericCellValue();
		System.out.println(vaibhav);
	}

}
