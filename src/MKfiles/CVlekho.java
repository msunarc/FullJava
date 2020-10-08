package MKfiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CVlekho {
	public static void  cvlekho(){
		try
		{
			String path="Date\\places.csv";
			File f= new File(path);
			FileWriter fw= new FileWriter(f,true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.newLine();
			bw.newLine();
			bw.write("Liberity statue,New york,America");
			bw.newLine();
			bw.write("santosa island,singapore,singapore");
		bw.close();
	}
	catch(IOException e) {
		e.printStackTrace();
	}

}
}
