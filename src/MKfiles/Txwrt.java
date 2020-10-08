package MKfiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Txwrt {
	public static void lekhofile(String words,String chat) {
		
		try {
			String path="Date\\bee.txt.txt";
			File f= new File(path);
			FileWriter fw= new FileWriter(f,true);
			BufferedWriter bw= new BufferedWriter(fw);
			bw.newLine();
			bw.newLine();
			bw.newLine();
			
			bw.write(words);
			bw.newLine();
			bw.write(chat);
			bw.close();
			
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
