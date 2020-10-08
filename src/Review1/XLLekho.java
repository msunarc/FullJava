package Review1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLLekho {
	public  static void xllekho() throws IOException {
		String path="C:\\ABC\\JAVA\\flower.xlsx";
		File f= new File(path);
		FileOutputStream fo=new FileOutputStream(f);
		try {
		
		XSSFWorkbook wb= new XSSFWorkbook();
		XSSFSheet ws= wb.createSheet("Types") ;
		Row rw=ws.createRow(10);
		Cell cl=rw.createCell(10);
		cl.setCellValue("Jasmine");
		wb.write(fo);
		wb.close();
	}
catch(IOException e) {
	e.printStackTrace();
	
}
}
}