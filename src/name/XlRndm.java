package name;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlRndm {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		String path="C:\\ABC\\JAVA\\Num.xlsx";
		File f= new File(path);
		FileOutputStream fo=new FileOutputStream(f);
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet ws=wb.createSheet("table");
		ws.createRow(0).createCell(0).setCellValue("Sl.no.");
		ws.getRow(0).createCell(1).setCellValue("Digit");
		
		for (int i =1; i<=499; i++) {
			ws.createRow(i).createCell(0).setCellValue(i);
			ws.getRow(i).createCell(1).setCellValue(Number(100,999));
			
	}
wb.write(fo);
wb.close();
}
	public static int Number(int min,int max) {
		if(min>=max) {
			throw new IllegalArgumentException("max mus be bigger value");
	
		}
		Random r =new Random();
		return r.nextInt((max-min)+1)+min;
	}
}