package usingapachepoitofetchdatafromexcelfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readentirerowandcolumndata {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	//create and read file
	String path="G:\\eclipse run programms\\selenium projects\\src\\usingapachepoitofetchdatafromexcelfile\\readfile.xlsx";
	FileInputStream fis  = new FileInputStream(path);
	//create workbook
	Workbook wb = WorkbookFactory.create(fis);
	//get the sheet
	Sheet sh= wb.getSheet("sheet1"); 
	for (int i=0;i<=sh.getLastRowNum();i++)
	{
		for (int j=0;j<1;j++)
		{
			Row r=sh.getRow(i);
			Cell c=r.getCell(j);
			String data=c.getStringCellValue();
			System.out.println(data);
		}
	}
}
}
