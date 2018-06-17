package readexcelfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class dataread {
	
	public Properties getproperty() throws IOException
	{
		FileInputStream fis = new FileInputStream("/selenium projects/src/readexcelfile/data.properties");
		Properties pobj= new Properties();
		pobj.load(fis);
		return pobj;
	}
	
	public  String excelgetdata(String sheetname,int rowno,int cellno) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("/selenium projects/src/readexcelfile/project data.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row r= sh.getRow(rowno);
		Cell c =r.getCell(cellno);
		String data= c.getStringCellValue();
		return data;
	}

}
