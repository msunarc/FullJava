package MKfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Htpado {
	public static void htpado() {
		try {
			String path="Date\\flower.html";
					File f=new File(path);
			FileReader fr=new FileReader(f);
			BufferedReader br= new BufferedReader(fr);
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
