package xlfile;

import java.io.FileInputStream;
import java.io.IOException;

public class Xfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			readxlsxfile("C:\\ABC\\JAVA\\lysol.xlsx");

		}

		private static void readxlsxfile(String file) {
			try {
				XSSFWorkbook ws=new XSSFWorkbook (new FileInputStream(file));
				XSSFSheet sheet=ws.getSheet("memo");
				XSSFRow row =null;
				int i=0;
				while((row=sheet.getRow(i))!=null){
					System.out.println(row.getCell(0).getNumericCellValue());
					System.out.println(row.getCell(1).getStringCellValue());
					i++;
					
				}
			}
			catch (IOException e) {
				
			}
		}

	


	}

}
