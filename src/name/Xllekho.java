package name;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xllekho {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\ABC\\JAVA\\drink.xlsx";
  File f =new File(path);
  FileOutputStream fo=new  FileOutputStream (f);
  
  XSSFWorkbook wb=new XSSFWorkbook();
  XSSFSheet ws=wb.createSheet("Energy Drink");
  Row rw=ws.createRow(6);
  Cell cl=rw.createCell(4);
  
  cl.setCellValue("Badam milk");
  wb.write(fo);
  wb.close();
  
	}

}
