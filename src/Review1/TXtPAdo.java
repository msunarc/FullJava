package Review1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TXtPAdo {
	/*public static void txtPado() {
		String path="ReviewFile\\Friends.txt";
		try {
			File f= new File(path);
			FileReader fr=new FileReader(f);
			BufferedReader br= new BufferedReader(fr);
			String Line=null;
			while((Line=br.readLine())!=null) {
				System.out.println(Line);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}*/
	
public static void txtlekho() {
	String path="ReviewFile\\Friends.txt";
	try {
		File f=new File(path);
		FileWriter fw= new FileWriter(f,true) ;
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write("friends are my strength" );
		bw.close();
	
}
catch(IOException e) {
	e.printStackTrace();
	
	}
}
}
