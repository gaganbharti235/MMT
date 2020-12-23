package com.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelInput {
	
	
	
	 public void readExcel(String fileName,String sheetName) throws IOException{

		 String filepath="C:\\Users\\ACER\\Downloads\\"+fileName;
		 
		 System.out.println(filepath);
			
		 File f=new File(filepath);
			
			//Create an object of FileInputStream class to read excel file
			
			FileInputStream fis=new FileInputStream(f);
			
			Workbook wb = null;
			
			//Find the file extension by splitting file name in substring  and getting only extension name
			
			String fileextension = fileName.substring(fileName.indexOf("."));
			
			System.out.println(fileextension);
			
			 //Check condition if the file is xlsx file
			
			if(fileextension.equals(".xlsx"))
			{				
				//If it is xlsx file then create object of XSSFWorkbook class

				wb = new XSSFWorkbook(fis);
				
			}
			//Check condition if the file is xls file

		    else if(fileextension.equals(".xls")){

		        //If it is xls file then create object of HSSFWorkbook class

		    	wb = new HSSFWorkbook(fis);

		    }
			
			 //Read sheet inside the workbook by its name
			System.out.println("Sheet name is : "+sheetName);
		    Sheet sh = wb.getSheet(sheetName);
		    
		  //Find number of rows in excel file
		    
		    int rowCount=sh.getLastRowNum()-sh.getFirstRowNum();
		    
		    System.out.println("No. for rows in Excel is : "+rowCount);
		    
		    //Create a loop over all the rows of excel file to read it
		    
		    
		    for(int i =0;i<rowCount+1;i++)
		    {
		    	
		    	Row row=sh.getRow(i);
		    	System.out.println("Cell values for : "+i+"row");
	    		
		    	
		    	for(int j =0;j<row.getLastCellNum();j++)
			    {
		    		
		    		System.out.println(row.getCell(j).getStringCellValue());
		    		
			    }
			    }
		    	
		    	
		    }
		    


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//Create an object of File class to open xlsx file
		
		ExcelInput ei=new ExcelInput();
			
			ei.readExcel("Data.xlsx", "Sheet1");

	}

}
