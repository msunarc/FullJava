package fele;

import java.io.File;
import java.io.IOException;

public class Fele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	File f1= new File("sun.txt");
	if(f1.createNewFile()) {
		System.out.println("grt day" + f1.getName());
	}
	else {
		System.out.println(" had fun");
	}
}  catch(IOException e) {
	System.out.println("fun n dance");
	e.printStackTrace();
}
	}

}
