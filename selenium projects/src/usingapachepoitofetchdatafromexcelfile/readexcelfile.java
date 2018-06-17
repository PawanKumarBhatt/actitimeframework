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

public class readexcelfile {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		//create and read the file
		String path1="‪G:\\eclipse run programms\\readfile1.xlsx";
		String path="G:\\eclipse run programms\\selenium projects\\src\\usingapachepoitofetchdatafromexcelfile\\readfile.xlsx";
		FileInputStream fis=new FileInputStream(path);
		//create workspace
		Workbook wb= WorkbookFactory.create(fis);
		//get the sheet
		Sheet sh= wb.getSheet("Sheet1");
		//get the row 
		Row r= sh.getRow(0);
		//get the cell
		Cell c=r.getCell(0);
		//get the data
		String data= c.getStringCellValue();
		System.out.println(data);
		//get the number of rows
		int  rownum=sh.getLastRowNum();
		System.out.println(rownum);
		//get the number  of cell  in a row
		int cnum=r.getLastCellNum();
		System.out.println(cnum);
	}

}
