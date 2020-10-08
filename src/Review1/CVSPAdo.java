package Review1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CVSPAdo {
	/*
	 * public static void Pado() {
	 * 
	 * try {
	 * 
	 * String path="ReviewFile\\Rev..csv";
	 * 
	 * 
	 * File F=new File(path); FileReader fw=new FileReader (F); BufferedReader
	 * br=new BufferedReader (fw); String line=null;
	 * while(((line=br.readLine())!=null)){ System.out.println(line); } }
	 * catch(IOException e) { e.printStackTrace(); }
	 */

	public static void Lekho() {
		String path="ReviewFile\\\\Rev..csv";
  
  try {
	  File F= new File(path);
	  FileWriter fw=new FileWriter(F,true);
	  BufferedWriter bw=new BufferedWriter(fw);
	  bw.newLine();
	  bw.write("Calcutta, Rosugola, fish");
	  bw.newLine();
	  bw.write("gandhinagar, Handva, thapla");
	  
	  bw.close();
  }
  catch(IOException e) { e.printStackTrace(); }
	}
	
}