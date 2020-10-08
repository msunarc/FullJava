package Review1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Rndm {
	public static void Rndmnum() throws IOException {
		String path="C:\\ABC\\JAVA\\Season.xlsx";
		File f= new File(path);
		FileOutputStream fo =new FileOutputStream (f);
		
			XSSFWorkbook wb= new XSSFWorkbook();
			XSSFSheet s=wb.createSheet("Number");
			
			 s.createRow(0).createCell(0).setCellValue("Serial no.");
			 s.getRow(0).createCell(1).setCellValue("number");
			 for(int i=1;i<500;i++) {
				 s.createRow(i).createCell(0).setCellValue(i);
				 s.getRow(i).createCell(1).setCellValue(no(10,100));
			 } 
			 wb.write(fo);
			 wb.close();
			 }
			 
			 private static int no(int min, int max) {
					if (min>=max) {
						throw new IllegalArgumentException("wrong");
					}
					Random r=new Random();
					return r.nextInt(max-min)+1+min;
			 
			 
		}
		
		}
	

