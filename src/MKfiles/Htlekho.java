package MKfiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Htlekho {
	public static void htlekho(String x,int a,int b) {
		
		
		try {
			String path="Date\\flower.html";
			File f=new File(path);
			FileWriter fw=new FileWriter(f,true);
			BufferedWriter bw= new BufferedWriter(fw);
			bw.newLine();
			bw.write(x,3,5);
			bw.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
