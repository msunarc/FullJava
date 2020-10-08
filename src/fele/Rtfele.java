package fele;

import java.io.FileWriter;
import java.io.IOException;

public class Rtfele {

	public static void main(String[] args) {
try {		// TODO Auto-generated method stub
FileWriter fw = new FileWriter("sun.txt");
fw.write("cheer to cheer others");
fw.write(" Sunita,it  is best ");
fw.close();
System.out.println("i am first");
} catch (IOException e) {
	System.out.println(" best");
	e.printStackTrace();
}
	}

}
