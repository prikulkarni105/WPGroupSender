package GroupSender;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class WriteDataIntoExel 
{

public static void writeExelSheet(LinkedList<String> Grouplinks, LinkedList<String> Groupnames, LinkedList<String> Categorynames, LinkedList<String> Countrynames, LinkedList<String> languages  ) throws Exception
	{
	// workbook object
	XSSFWorkbook workbook=new XSSFWorkbook();
	
	// spreadsheet object
	XSSFSheet sheet=workbook.createSheet("Category1");
	
	// This data needs to be written (Object[])
	LinkedList<Object[]> readlist=new LinkedList<Object[]>();
	
	readlist.add(new Object[] {"GroupLinks", "GroupNames", "CategoryNames", "CountryNames", "Languages"});
//exception handle	
	try
	{
		for(int i=0; i<Groupnames.size(); i++)
		{
		readlist.add(new Object[] { Grouplinks.get(i).toString(), Groupnames.get(i).toString(), Categorynames.get(i).toString(), Countrynames.get(i).toString(), languages.get(i).toString()});
		}
	} 
	catch (Exception e) 
	{
		// TODO: handle exception
		System.out.println("successfull handled exception");
	}
	
	
    // writing the data into the sheets using foreach
	int rowcount=0;
	for (Object[] list : readlist)
	{
		//create row
		XSSFRow row=sheet.createRow(rowcount++);
		int cellcount=0;
		for (Object value : list) 
		{
		XSSFCell cell= row.createCell(cellcount++);
		cell.setCellValue(value.toString());
		}
	}
	
	
	FileOutputStream file=new FileOutputStream(new File(System.getProperty("user.dir")+"//ExelFiles//Category1.xlsx"));
	workbook.write(file);
	file.close();
	
	}
	
}
